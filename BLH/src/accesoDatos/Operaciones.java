/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import clases.Encargado;
import clases.Medico;
import clases.Motorista;
import clases.Paciente;
import clases.Vehiculo;
import clases.VisitaDonacion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Chavez Vigil
 */
public class Operaciones {

    Conexion con = new Conexion();

    public void almacenarPaciente(Paciente pte) {
        try {
        } catch (Exception e) {
        }
    }

    public void almacenarMedico(Medico doc) {
        try {
            PreparedStatement sen = con.conectar().prepareStatement("UPDATE Medico SET Nombre ='" + doc.getNombre() + "', Apellido ='" + doc.getApellido() + "', Especialidad ='" + doc.getEspecialidad() + "' WHERE JVPM ='" + doc.getJvpm() + "'");
            if (sen.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "¡Datos Modificados!");
            } else {
                PreparedStatement sentencia = con.conectar().prepareStatement("INSERT INTO Medico (JVPM,Nombre,Apellido,Especialidad) VALUES ('" + doc.getJvpm() + "','" + doc.getNombre() + "','" + doc.getApellido() + "','" + doc.getEspecialidad() + "')");
                sentencia.executeUpdate();
                con.desconectar();
                JOptionPane.showMessageDialog(null, "¡Datos Almacenados!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public void eliminarMedico(Medico doc) {
        try {
            PreparedStatement sentencia = con.conectar().prepareStatement("DELETE FROM Medico WHERE JVPM = '" + doc.getJvpm() + "'");
            if (sentencia.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "¡Eliminado Correctamente!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public void listarMedicos(JTable tabla) {
        try {

            Statement sentencia = null;
            ResultSet resultado = null;

            sentencia = con.conectar().createStatement();
            resultado = sentencia.executeQuery("SELECT * FROM Medico ORDER BY Nombre asc");
            DefaultTableModel modelo = new DefaultTableModel();

            modelo.addColumn("JVPM");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Especialidad");
            int valor = 0;
            while (resultado.next()) {
                if (!resultado.getString("Nombre").equals("salvavidas")) {
                    modelo.addRow(new Object[]{});
                    modelo.setValueAt(resultado.getInt("JVPM"), valor, 0);
                    modelo.setValueAt(resultado.getString("Nombre"), valor, 1);
                    modelo.setValueAt(resultado.getString("Apellido"), valor, 2);
                    modelo.setValueAt(resultado.getString("Especialidad"), valor, 3);
                    valor = valor + 1;
                }
            }
            tabla.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        con.desconectar();

    }

    public void almacenarMotorista(Motorista moto) {
        try {
            PreparedStatement sen = con.conectar().prepareStatement("UPDATE Motorista SET Nombre ='" + moto.getNombre() + "', Apellidos ='" + moto.getApellido() + "' WHERE DUI ='" + moto.getDui() + "'");
            if (sen.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "¡Datos Modificados!");
            } else {
                PreparedStatement sentencia = con.conectar().prepareStatement("INSERT INTO Motorista (Nombre,Apellidos,DUI) VALUES ('" + moto.getNombre() + "','" + moto.getApellido() + "','" + moto.getDui() + "')");
                sentencia.executeUpdate();
                con.desconectar();
                JOptionPane.showMessageDialog(null, "¡Datos Almacenados!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public void eliminarMotorista(Motorista moto) {
        try {
            PreparedStatement sentencia = con.conectar().prepareStatement("DELETE FROM Motorista WHERE DUI = '" + moto.getDui() + "'");
            if (sentencia.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "¡Eliminado Correctamente!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public void listarMotoristas(JTable tabla) {
        try {
            Statement sentencia = null;
            ResultSet resultado = null;

            sentencia = con.conectar().createStatement();
            resultado = sentencia.executeQuery("SELECT * FROM Motorista ORDER BY Apellidos asc");
            DefaultTableModel modelo = new DefaultTableModel();

            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("DUI");
            int valor = 0;
            while (resultado.next()) {
                if (!resultado.getString("Nombre").equals("salvavidas")) {
                    modelo.addRow(new Object[]{});
                    modelo.setValueAt(resultado.getString("Nombre"), valor, 0);
                    modelo.setValueAt(resultado.getString("Apellidos"), valor, 1);
                    modelo.setValueAt(resultado.getString("DUI"), valor, 2);
                    valor = valor + 1;
                }
            }
            tabla.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        con.desconectar();
    }

    public void almacenarVehiculo(Vehiculo veh) {
        try {
            PreparedStatement sen = con.conectar().prepareStatement("UPDATE Vehiculo SET Tipo ='" + veh.getTipo() + "' WHERE IdVehiculo ='" + veh.getPlaca() + "'");
            if (sen.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "¡Datos Modificados!");
            } else {
                PreparedStatement sentencia = con.conectar().prepareStatement("INSERT INTO Vehiculo (IdVehiculo,Tipo) VALUES ('" + veh.getPlaca() + "','" + veh.getTipo() + "')");
                sentencia.executeUpdate();
                con.desconectar();
                JOptionPane.showMessageDialog(null, "¡Datos Almacenados!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public void eliminarVehiculo(Vehiculo veh) {
        try {
            PreparedStatement sentencia = con.conectar().prepareStatement("DELETE FROM Vehiculo WHERE IdVehiculo = '" + veh.getPlaca() + "'");
            if (sentencia.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "¡Eliminado Correctamente!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public void listarVehiculo(JTable tabla) {
        try {
            Statement sentencia = null;
            ResultSet resultado = null;

            sentencia = con.conectar().createStatement();
            resultado = sentencia.executeQuery("SELECT * FROM Vehiculo ORDER BY IdVehiculo asc");
            DefaultTableModel modelo = new DefaultTableModel();

            modelo.addColumn("Placa");
            modelo.addColumn("Tipo");
            int valor = 0;
            while (resultado.next()) {
                if (!resultado.getString("Tipo").equals("salvavidas")) {
                    modelo.addRow(new Object[]{});
                    modelo.setValueAt(resultado.getString("IdVehiculo"), valor, 0);
                    modelo.setValueAt(resultado.getString("Tipo"), valor, 1);
                    valor = valor + 1;
                }
            }
            tabla.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        con.desconectar();
    }

    public void almacenarRuta(VisitaDonacion visita, DefaultTableModel trayectos) {
        try {
            Statement sentencia = con.conectar().createStatement();
            ResultSet resultado = sentencia.executeQuery("SELECT IdMotorista FROM Motorista WHERE DUI ='" + visita.getDuiMotorista() + "'");
            resultado.next();
            int idMoto = resultado.getInt("IdMotorista");

            Statement se = con.conectar().createStatement();
            ResultSet resu = se.executeQuery("SELECT IdUnidad FROM UnidadTransporte WHERE IdVehiculo ='" + visita.getIdVehiculo() + "' AND idMotorista = '" + idMoto + "'");

            if (resu.next() == true) {
                Statement sentec = con.conectar().createStatement();
                ResultSet result = sentec.executeQuery("SELECT IdUnidad FROM UnidadTransporte WHERE IdVehiculo ='" + visita.getIdVehiculo() + "' AND idMotorista = '" + idMoto + "'");
                result.next();
                int idUnidad = result.getInt("IdUnidad");
                for (int i = 0; i < trayectos.getRowCount(); i++) {
                    PreparedStatement sen = con.conectar().prepareStatement("INSERT INTO VisitaDonacion (Fecha,Hora,Kilometraje,LugarSalida,LugarLlegada,Distancia,Galones,JVPM,IdUnidad) VALUES ('" + visita.getFecha() + "','" + trayectos.getValueAt(i, 0) + "','" + trayectos.getValueAt(i, 1) + "','" + trayectos.getValueAt(i, 2) + "','" + trayectos.getValueAt(i, 3) + "','" + trayectos.getValueAt(i, 4) + "','" + trayectos.getValueAt(i, 5) + "','" + visita.getJvpm() + "','" + idUnidad + "')");
                    sen.executeUpdate();
                }
            } else {
                PreparedStatement sent = con.conectar().prepareStatement("INSERT INTO UnidadTransporte (IdVehiculo,idMotorista) VALUES ('" + visita.getIdVehiculo() + "','" + idMoto + "')");
                sent.executeUpdate();

                Statement sentec = con.conectar().createStatement();
                ResultSet result = sentec.executeQuery("SELECT IdUnidad FROM UnidadTransporte WHERE IdVehiculo ='" + visita.getIdVehiculo() + "' AND idMotorista = '" + idMoto + "'");
                result.next();
                int idUnidad = result.getInt("IdUnidad");
                for (int i = 0; i < trayectos.getRowCount(); i++) {
                    PreparedStatement sen = con.conectar().prepareStatement("INSERT INTO VisitaDonacion (Fecha,Hora,Kilometraje,LugarSalida,LugarLlegada,Distancia,Galones,JVPM,IdUnidad) VALUES ('" + visita.getFecha() + "','" + trayectos.getValueAt(i, 0) + "','" + trayectos.getValueAt(i, 1) + "','" + trayectos.getValueAt(i, 2) + "','" + trayectos.getValueAt(i, 3) + "','" + trayectos.getValueAt(i, 4) + "','" + trayectos.getValueAt(i, 5) + "','" + visita.getJvpm() + "','" + idUnidad + "')");
                    sen.executeUpdate();
                }
            }
            JOptionPane.showMessageDialog(null, "¡Datos almacenados correctamente!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void listarRutas(JTable table) {
        try {
            Statement sentencia = null;
            ResultSet resultado = null;

            sentencia = con.conectar().createStatement();
            resultado = sentencia.executeQuery("SELECT * FROM VisitaDonacion ORDER BY IdVisitaDonacion asc");

            Statement senten = con.conectar().createStatement();
            ResultSet resulta = senten.executeQuery("SELECT COUNT(IdUnidad) FROM VisitaDonacion");
            resulta.next();
            int tamano = resulta.getInt("");
            String motorista[] = new String[tamano];
            String vehiculo[] = new String[tamano];
            for (int i = 0; i < tamano; i++) {
                resultado.next();
                Statement sentenc = con.conectar().createStatement();
                ResultSet resultad = sentenc.executeQuery("SELECT idMotorista, IdVehiculo FROM UnidadTransporte where IdUnidad = '" + resultado.getInt("IdUnidad") + "'");
                resultad.next();
                Statement sen1 = con.conectar().createStatement();
                ResultSet res1 = sen1.executeQuery("SELECT Nombre,Apellidos FROM Motorista WHERE IdMotorista ='" + resultad.getInt("idMotorista") + "'");             
                res1.next();
                motorista[i] = res1.getString("Nombre") + " " + res1.getString("Apellidos");
                vehiculo[i] = resultad.getString("IdVehiculo");
            }

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Número");
            modelo.addColumn("Fecha");
            modelo.addColumn("Hora");
            modelo.addColumn("Lugar Salida");
            modelo.addColumn("Lugar Llegada");
            modelo.addColumn("Distancia");
            modelo.addColumn("Motorista");
            modelo.addColumn("Vehículo");
            modelo.addColumn("(JVPM)");
            int valor = 0;
            int dato = 1;
            Statement s = con.conectar().createStatement();
            ResultSet r = s.executeQuery("SELECT * FROM VisitaDonacion ORDER BY IdVisitaDonacion asc");
            while (r.next()) {
                if (r.getInt("IdVisitaDonacion") != 1) {
                    modelo.addRow(new Object[]{});
                    modelo.setValueAt(r.getInt("IdVisitaDonacion"), valor, 0);
                    modelo.setValueAt(r.getDate("Fecha"), valor, 1);
                    modelo.setValueAt(r.getString("Hora"), valor, 2);
                    modelo.setValueAt(r.getString("LugarSalida"), valor, 3);
                    modelo.setValueAt(r.getString("LugarLlegada"), valor, 4);
                    modelo.setValueAt(r.getFloat("Distancia"), valor, 5);
                    modelo.setValueAt(motorista[dato], valor, 6);
                    modelo.setValueAt(vehiculo[dato], valor, 7);
                    modelo.setValueAt(r.getInt("JVPM"), valor, 8);
                    valor = valor + 1;
                    dato = dato +1;
                }
            }
            table.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        con.desconectar();

    }

    public void almacenarEncargado(Encargado encargado) {
        try {
            PreparedStatement sen = con.conectar().prepareStatement("UPDATE EncargadoPaciente SET Nombres ='" + encargado.getNombre() + "', Apeliidos ='" + encargado.getApellido() + "',DUI = '" + encargado.getDui() + "', Direccion = '" + encargado.getDireccion() + "', Parentesco = '" + encargado.getParentesco() + "', Telefono = '" + encargado.getTelefono() + "' WHERE Nit ='" + encargado.getNit() + "'");
            if (sen.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "¡Datos Modificados!");
            } else {
                PreparedStatement sentencia = con.conectar().prepareStatement("INSERT INTO EncargadoPaciente (Nit,Nombres,Apeliidos,DUI,Direccion,Parentesco,Telefono) VALUES ('" + encargado.getNit() + "','" + encargado.getNombre() + "','" + encargado.getApellido() + "','" + encargado.getDui() + "','" + encargado.getDireccion() + "','" + encargado.getParentesco() + "','" + encargado.getTelefono() + "')");
                sentencia.executeUpdate();
                JOptionPane.showMessageDialog(null, "¡Datos Almacenados!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        con.desconectar();
    }

    public void listarEncargados(JTable tabla) {
        try {

            TableColumn numero = null;
            Statement sentencia = null;
            ResultSet resultado = null;

            sentencia = con.conectar().createStatement();
            resultado = sentencia.executeQuery("SELECT Nit,Nombres,Apeliidos,DUI,Direccion,Parentesco,Telefono FROM EncargadoPaciente ORDER BY Apeliidos asc");
            DefaultTableModel modelo = new DefaultTableModel();

            modelo.addColumn("NIT");
            modelo.addColumn("DUI");
            modelo.addColumn("Nombres");
            modelo.addColumn("Apellidos");
            modelo.addColumn("Parentesco");
            modelo.addColumn("Dirección");
            modelo.addColumn("Teléfono");
            int valor = 0;
            while (resultado.next()) {
                modelo.addRow(new Object[]{});
                modelo.setValueAt(resultado.getString("Nit"), valor, 0);
                modelo.setValueAt(resultado.getString("DUI"), valor, 1);
                modelo.setValueAt(resultado.getString("Nombres"), valor, 2);
                modelo.setValueAt(resultado.getString("Apeliidos"), valor, 3);
                modelo.setValueAt(resultado.getString("Parentesco"), valor, 4);
                modelo.setValueAt(resultado.getString("Direccion"), valor, 5);
                modelo.setValueAt(resultado.getString("Telefono"), valor, 6);
                valor = valor + 1;
            }
            tabla.setModel(modelo);
            numero = tabla.getColumnModel().getColumn(0);
            numero.setPreferredWidth(105);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        con.desconectar();

    }

    public void eliminarEncargado(Encargado encargado) {
        try {
            PreparedStatement sentencia = con.conectar().prepareStatement("DELETE FROM EncargadoPaciente WHERE Nit = '" + encargado.getNit() + "'");
            if (sentencia.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "¡Eliminado Correctamente!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public void listarPacientesFiltrados(JTable tabla, String campo, String value) {
        try {

            Statement sentencia = null;
            ResultSet resultado = null;

            sentencia = con.conectar().createStatement();
            resultado = sentencia.executeQuery("SELECT * FROM Paciente WHERE " + campo + " ='" + value + "'");
            DefaultTableModel modelo = new DefaultTableModel();

            modelo.addColumn("Carnet");
            modelo.addColumn("Nombres");
            modelo.addColumn("Apellidos");
            modelo.addColumn("FechaNac");
            modelo.addColumn("SemanasGestacion");
            modelo.addColumn("Sexo");
            modelo.addColumn("Nit");
            modelo.addColumn("Notas");
            modelo.addColumn("Departamento");
            modelo.addColumn("Municipio");
            modelo.addColumn("Parto");
            modelo.addColumn("EdadMaterna");
            modelo.addColumn("Gravidez");
            modelo.addColumn("Patologia");
            modelo.addColumn("Tipo");

            int valor = 0;
            while (resultado.next()) {
                modelo.addRow(new Object[]{});
                modelo.setValueAt(resultado.getString("Carnet"), valor, 0);
                modelo.setValueAt(resultado.getString("Nombres"), valor, 1);
                modelo.setValueAt(resultado.getString("Apellidos"), valor, 2);
                modelo.setValueAt(resultado.getDate("FechaNac"), valor, 3);
                modelo.setValueAt(resultado.getDouble("SemanasGestacion"), valor, 4);
                modelo.setValueAt(resultado.getString("Sexo"), valor, 5);
                modelo.setValueAt(resultado.getString("Nit"), valor, 6);
                modelo.setValueAt(resultado.getString("Notas"), valor, 7);
                modelo.setValueAt(resultado.getString("Departamento"), valor, 8);
                modelo.setValueAt(resultado.getString("Municipio"), valor, 9);
                modelo.setValueAt(resultado.getString("Parto"), valor, 10);
                modelo.setValueAt(resultado.getString("EdadMaterna"), valor, 11);
                modelo.setValueAt(resultado.getString("Gravidez"), valor, 12);
                modelo.setValueAt(resultado.getString("Patologia"), valor, 13);
                modelo.setValueAt(resultado.getString("Tipo"), valor, 14);
                valor = valor + 1;
            }
            tabla.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        con.desconectar();
    }

    public void eliminarRuta(int id) {
        try {
            PreparedStatement sentencia = con.conectar().prepareStatement("DELETE FROM VisitaDonacion WHERE IdVisitaDonacion ='" + id + "'");
            if (sentencia.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "¡Eliminado Correctamente!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}
