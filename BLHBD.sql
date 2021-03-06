USE [BLHBD]
GO
/****** Object:  Table [dbo].[Ruta]    Script Date: 10/19/2012 02:29:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Ruta](
	[idRuta] [int] IDENTITY(1,1) NOT NULL,
	[Descripcion] [varchar](150) NULL,
 CONSTRAINT [PK_Ruta] PRIMARY KEY CLUSTERED 
(
	[idRuta] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Persona]    Script Date: 10/19/2012 02:29:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Persona](
	[Documento] [varchar](50) NOT NULL,
	[Nombres] [varchar](50) NULL,
	[Apellidos] [varchar](50) NULL,
	[FechaNac] [varchar](50) NULL,
	[Peso] [varchar](50) NULL,
	[Estatura] [varchar](50) NULL,
	[Direccion] [varchar](150) NULL,
	[SemGesta] [varchar](50) NULL,
	[FechaParto] [varchar](50) NULL,
	[vdrl] [varchar](50) NULL,
	[hbsag] [varchar](50) NULL,
	[hiv] [varchar](50) NULL,
	[TransSangui] [varchar](50) NULL,
	[Tabaquismo] [varchar](50) NULL,
	[Etilismo] [varchar](50) NULL,
	[AptaDonar] [varchar](50) NULL,
	[FechaObtDatos] [varchar](50) NULL,
 CONSTRAINT [PK_Persona] PRIMARY KEY CLUSTERED 
(
	[Documento] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Motorista]    Script Date: 10/19/2012 02:29:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Motorista](
	[IdMotorista] [int] IDENTITY(1,1) NOT NULL,
	[Nombre] [varchar](50) NULL,
	[Apellidos] [varchar](50) NULL,
	[DUI] [varchar](50) NULL,
 CONSTRAINT [PK_Motorista] PRIMARY KEY CLUSTERED 
(
	[IdMotorista] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Medico]    Script Date: 10/19/2012 02:29:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Medico](
	[JVPM] [int] NOT NULL,
	[Nombre] [varchar](50) NULL,
	[Apellido] [varchar](50) NULL,
	[Especialidad] [varchar](50) NULL,
 CONSTRAINT [PK_Medico] PRIMARY KEY CLUSTERED 
(
	[JVPM] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[InformeProduccion]    Script Date: 10/19/2012 02:29:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[InformeProduccion](
	[IdProduccion] [date] NOT NULL,
	[AtenIndividual] [int] NULL,
	[AtenGrupo] [int] NULL,
	[VisDom] [int] NULL,
	[TotalAten] [int] NULL,
	[Recolectado] [float] NULL,
	[Distribuido] [float] NULL,
	[DonantesP] [int] NULL,
	[ReceptoresP] [int] NULL,
	[Microbiologia] [float] NULL,
	[FisQui] [float] NULL,
	[Crematocrito] [float] NULL,
	[AcidezDornic] [float] NULL,
	[TotAnaFQ] [float] NULL,
	[TotGenAna] [float] NULL,
 CONSTRAINT [PK_InformeProduccion] PRIMARY KEY CLUSTERED 
(
	[IdProduccion] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[InformeLaboratorista]    Script Date: 10/19/2012 02:29:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[InformeLaboratorista](
	[Fecha] [date] NOT NULL,
	[MuestrasAna] [int] NULL,
	[PresenciaN] [int] NULL,
	[PresenciaPor] [float] NULL,
	[AusenciaN] [int] NULL,
	[AusenciaPor] [float] NULL,
 CONSTRAINT [PK_InformeLaboratorista] PRIMARY KEY CLUSTERED 
(
	[Fecha] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Extras]    Script Date: 10/19/2012 02:29:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Extras](
	[IdExtras] [int] IDENTITY(1,1) NOT NULL,
	[Valor] [varchar](50) NULL,
	[Descripcion] [varchar](600) NULL,
 CONSTRAINT [PK_Extras] PRIMARY KEY CLUSTERED 
(
	[IdExtras] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[EncargadoPaciente]    Script Date: 10/19/2012 02:29:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[EncargadoPaciente](
	[Nit] [varchar](50) NOT NULL,
	[Carnet] [varchar](50) NULL,
	[Nombres] [varchar](50) NULL,
	[Apeliidos] [varchar](50) NULL,
	[DUI] [varchar](50) NULL,
	[Direccion] [varchar](200) NULL,
	[Parentesco] [varchar](50) NULL,
	[Telefono] [varchar](50) NULL,
 CONSTRAINT [PK_EncargadoPaciente] PRIMARY KEY CLUSTERED 
(
	[Nit] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Vehiculo]    Script Date: 10/19/2012 02:29:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Vehiculo](
	[IdVehiculo] [varchar](50) NOT NULL,
	[Tipo] [varchar](50) NULL,
 CONSTRAINT [PK_Vehiculo] PRIMARY KEY CLUSTERED 
(
	[IdVehiculo] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Usuario]    Script Date: 10/19/2012 02:29:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Usuario](
	[IdUsuario] [int] IDENTITY(1,1) NOT NULL,
	[Username] [varchar](50) NOT NULL,
	[Password] [varchar](50) NULL,
	[administrador] [bit] NULL,
 CONSTRAINT [PK_Usuario] PRIMARY KEY CLUSTERED 
(
	[Username] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[UnidadTransporte]    Script Date: 10/19/2012 02:29:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[UnidadTransporte](
	[IdUnidad] [int] IDENTITY(1,1) NOT NULL,
	[IdVehiculo] [varchar](50) NOT NULL,
	[idMotorista] [int] NOT NULL,
 CONSTRAINT [PK_UnidadTransporte] PRIMARY KEY CLUSTERED 
(
	[IdUnidad] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TelefonoPersona]    Script Date: 10/19/2012 02:29:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TelefonoPersona](
	[NoTel] [varchar](50) NOT NULL,
	[TipoTelefono] [varchar](50) NULL,
	[Documento] [varchar](50) NOT NULL,
 CONSTRAINT [PK_TelefonoPersona] PRIMARY KEY CLUSTERED 
(
	[NoTel] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Actividades]    Script Date: 10/19/2012 02:29:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Actividades](
	[IdActividades] [int] IDENTITY(1,1) NOT NULL,
	[Fecha] [date] NULL,
	[Hora] [varchar](50) NULL,
	[Usuario] [varchar](50) NULL,
	[Actividad] [varchar](50) NULL,
 CONSTRAINT [PK_Actividades] PRIMARY KEY CLUSTERED 
(
	[IdActividades] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Donacion]    Script Date: 10/19/2012 02:29:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Donacion](
	[IdDonacion] [int] IDENTITY(1,1) NOT NULL,
	[FechaDonacion] [varchar](50) NOT NULL,
	[TipoDonacion] [varchar](50) NULL,
	[RacionAcep] [int] NULL,
	[RacionDesc] [int] NULL,
	[Documento] [varchar](50) NULL,
	[Estatura] [varchar](50) NULL,
	[Peso] [varchar](50) NULL,
	[idVisitaDonacion] [int] NULL,
 CONSTRAINT [PK_Donacion_1] PRIMARY KEY CLUSTERED 
(
	[IdDonacion] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Paciente]    Script Date: 10/19/2012 02:29:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Paciente](
	[Carnet] [varchar](50) NOT NULL,
	[Nombres] [varchar](50) NULL,
	[Apellidos] [varchar](50) NULL,
	[FechaNac] [date] NULL,
	[SemanasGestacion] [float] NULL,
	[Sexo] [varchar](150) NULL,
	[Nit] [varchar](50) NULL,
	[Notas] [varchar](220) NULL,
	[Departamento] [varchar](50) NULL,
	[Municipio] [varchar](50) NULL,
	[Parto] [varchar](50) NULL,
	[EdadMaterna] [varchar](50) NULL,
	[Gravidez] [varchar](150) NULL,
	[Patologia] [varchar](150) NULL,
	[Tipo] [varchar](150) NULL,
 CONSTRAINT [PK_Paciente_1] PRIMARY KEY CLUSTERED 
(
	[Carnet] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[PropiedadPaciente]    Script Date: 10/19/2012 02:29:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[PropiedadPaciente](
	[IdPropiedadPaciente] [int] IDENTITY(1,1) NOT NULL,
	[fechaIncorporacion] [date] NULL,
	[pesoNacer] [float] NULL,
	[pesoIncorporarse] [float] NULL,
	[estaturaNacer] [float] NULL,
	[estaturaIncorporarse] [float] NULL,
	[pCefalicoNacer] [float] NULL,
	[pCefalicoIncorporarse] [float] NULL,
	[Carnet] [varchar](50) NULL,
 CONSTRAINT [PK_PropiedadPaciente] PRIMARY KEY CLUSTERED 
(
	[IdPropiedadPaciente] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Consulta]    Script Date: 10/19/2012 02:29:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Consulta](
	[IdConsulta] [int] IDENTITY(1,1) NOT NULL,
	[Diagnostico] [varchar](2000) NULL,
	[FechaHora] [date] NULL,
	[RacionAsignadaPte] [float] NULL,
	[JVPM] [int] NOT NULL,
	[Carnet] [varchar](50) NOT NULL,
	[Peso] [float] NULL,
	[Estatura] [float] NULL,
	[PerimetroCefalico] [varchar](150) NULL,
	[CondicionSalud] [varchar](50) NULL,
 CONSTRAINT [PK_Consulta] PRIMARY KEY CLUSTERED 
(
	[IdConsulta] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[VisitaDonacion]    Script Date: 10/19/2012 02:29:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[VisitaDonacion](
	[IdVisitaDonacion] [int] IDENTITY(1,1) NOT NULL,
	[Fecha] [date] NULL,
	[Hora] [varchar](50) NULL,
	[Kilometraje] [float] NULL,
	[LugarSalida] [varchar](50) NULL,
	[LugarLlegada] [varchar](50) NULL,
	[Distancia] [varchar](150) NULL,
	[Galones] [varchar](50) NULL,
	[JVPM] [int] NOT NULL,
	[IdUnidad] [int] NOT NULL,
 CONSTRAINT [PK_VisitaDonacion] PRIMARY KEY CLUSTERED 
(
	[IdVisitaDonacion] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[RutaVisita]    Script Date: 10/19/2012 02:29:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[RutaVisita](
	[idRutaVisita] [int] IDENTITY(1,1) NOT NULL,
	[idVisitaDonacion] [int] NOT NULL,
	[idRuta] [int] NOT NULL,
	[Descripcion] [varchar](150) NULL,
 CONSTRAINT [PK_RutaVisita] PRIMARY KEY CLUSTERED 
(
	[idRutaVisita] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  ForeignKey [FK_Actividades_Usuario]    Script Date: 10/19/2012 02:29:25 ******/
ALTER TABLE [dbo].[Actividades]  WITH CHECK ADD  CONSTRAINT [FK_Actividades_Usuario] FOREIGN KEY([Usuario])
REFERENCES [dbo].[Usuario] ([Username])
GO
ALTER TABLE [dbo].[Actividades] CHECK CONSTRAINT [FK_Actividades_Usuario]
GO
/****** Object:  ForeignKey [FK_Consulta_Medico1]    Script Date: 10/19/2012 02:29:25 ******/
ALTER TABLE [dbo].[Consulta]  WITH CHECK ADD  CONSTRAINT [FK_Consulta_Medico1] FOREIGN KEY([JVPM])
REFERENCES [dbo].[Medico] ([JVPM])
GO
ALTER TABLE [dbo].[Consulta] CHECK CONSTRAINT [FK_Consulta_Medico1]
GO
/****** Object:  ForeignKey [FK_Consulta_Paciente]    Script Date: 10/19/2012 02:29:25 ******/
ALTER TABLE [dbo].[Consulta]  WITH CHECK ADD  CONSTRAINT [FK_Consulta_Paciente] FOREIGN KEY([Carnet])
REFERENCES [dbo].[Paciente] ([Carnet])
GO
ALTER TABLE [dbo].[Consulta] CHECK CONSTRAINT [FK_Consulta_Paciente]
GO
/****** Object:  ForeignKey [FK_Donacion_Persona1]    Script Date: 10/19/2012 02:29:25 ******/
ALTER TABLE [dbo].[Donacion]  WITH CHECK ADD  CONSTRAINT [FK_Donacion_Persona1] FOREIGN KEY([Documento])
REFERENCES [dbo].[Persona] ([Documento])
GO
ALTER TABLE [dbo].[Donacion] CHECK CONSTRAINT [FK_Donacion_Persona1]
GO
/****** Object:  ForeignKey [FK_Donacion_Ruta]    Script Date: 10/19/2012 02:29:25 ******/
ALTER TABLE [dbo].[Donacion]  WITH CHECK ADD  CONSTRAINT [FK_Donacion_Ruta] FOREIGN KEY([idVisitaDonacion])
REFERENCES [dbo].[Ruta] ([idRuta])
GO
ALTER TABLE [dbo].[Donacion] CHECK CONSTRAINT [FK_Donacion_Ruta]
GO
/****** Object:  ForeignKey [FK_Paciente_EncargadoPaciente]    Script Date: 10/19/2012 02:29:25 ******/
ALTER TABLE [dbo].[Paciente]  WITH CHECK ADD  CONSTRAINT [FK_Paciente_EncargadoPaciente] FOREIGN KEY([Nit])
REFERENCES [dbo].[EncargadoPaciente] ([Nit])
GO
ALTER TABLE [dbo].[Paciente] CHECK CONSTRAINT [FK_Paciente_EncargadoPaciente]
GO
/****** Object:  ForeignKey [FK_PropiedadPaciente_Paciente]    Script Date: 10/19/2012 02:29:25 ******/
ALTER TABLE [dbo].[PropiedadPaciente]  WITH CHECK ADD  CONSTRAINT [FK_PropiedadPaciente_Paciente] FOREIGN KEY([Carnet])
REFERENCES [dbo].[Paciente] ([Carnet])
GO
ALTER TABLE [dbo].[PropiedadPaciente] CHECK CONSTRAINT [FK_PropiedadPaciente_Paciente]
GO
/****** Object:  ForeignKey [FK_RutaVisita_Ruta]    Script Date: 10/19/2012 02:29:25 ******/
ALTER TABLE [dbo].[RutaVisita]  WITH CHECK ADD  CONSTRAINT [FK_RutaVisita_Ruta] FOREIGN KEY([idRuta])
REFERENCES [dbo].[Ruta] ([idRuta])
GO
ALTER TABLE [dbo].[RutaVisita] CHECK CONSTRAINT [FK_RutaVisita_Ruta]
GO
/****** Object:  ForeignKey [FK_RutaVisita_VisitaDonacion]    Script Date: 10/19/2012 02:29:25 ******/
ALTER TABLE [dbo].[RutaVisita]  WITH CHECK ADD  CONSTRAINT [FK_RutaVisita_VisitaDonacion] FOREIGN KEY([idVisitaDonacion])
REFERENCES [dbo].[VisitaDonacion] ([IdVisitaDonacion])
GO
ALTER TABLE [dbo].[RutaVisita] CHECK CONSTRAINT [FK_RutaVisita_VisitaDonacion]
GO
/****** Object:  ForeignKey [FK_TelefonoPersona_Persona]    Script Date: 10/19/2012 02:29:25 ******/
ALTER TABLE [dbo].[TelefonoPersona]  WITH CHECK ADD  CONSTRAINT [FK_TelefonoPersona_Persona] FOREIGN KEY([Documento])
REFERENCES [dbo].[Persona] ([Documento])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[TelefonoPersona] CHECK CONSTRAINT [FK_TelefonoPersona_Persona]
GO
/****** Object:  ForeignKey [FK_UnidadTransporte_Motorista1]    Script Date: 10/19/2012 02:29:25 ******/
ALTER TABLE [dbo].[UnidadTransporte]  WITH CHECK ADD  CONSTRAINT [FK_UnidadTransporte_Motorista1] FOREIGN KEY([idMotorista])
REFERENCES [dbo].[Motorista] ([IdMotorista])
GO
ALTER TABLE [dbo].[UnidadTransporte] CHECK CONSTRAINT [FK_UnidadTransporte_Motorista1]
GO
/****** Object:  ForeignKey [FK_UnidadTransporte_Vehiculo]    Script Date: 10/19/2012 02:29:25 ******/
ALTER TABLE [dbo].[UnidadTransporte]  WITH CHECK ADD  CONSTRAINT [FK_UnidadTransporte_Vehiculo] FOREIGN KEY([IdVehiculo])
REFERENCES [dbo].[Vehiculo] ([IdVehiculo])
GO
ALTER TABLE [dbo].[UnidadTransporte] CHECK CONSTRAINT [FK_UnidadTransporte_Vehiculo]
GO
/****** Object:  ForeignKey [FK_VisitaDonacion_Medico]    Script Date: 10/19/2012 02:29:25 ******/
ALTER TABLE [dbo].[VisitaDonacion]  WITH CHECK ADD  CONSTRAINT [FK_VisitaDonacion_Medico] FOREIGN KEY([JVPM])
REFERENCES [dbo].[Medico] ([JVPM])
GO
ALTER TABLE [dbo].[VisitaDonacion] CHECK CONSTRAINT [FK_VisitaDonacion_Medico]
GO
/****** Object:  ForeignKey [FK_VisitaDonacion_UnidadTransporte]    Script Date: 10/19/2012 02:29:25 ******/
ALTER TABLE [dbo].[VisitaDonacion]  WITH CHECK ADD  CONSTRAINT [FK_VisitaDonacion_UnidadTransporte] FOREIGN KEY([IdUnidad])
REFERENCES [dbo].[UnidadTransporte] ([IdUnidad])
GO
ALTER TABLE [dbo].[VisitaDonacion] CHECK CONSTRAINT [FK_VisitaDonacion_UnidadTransporte]
GO
