# 👨‍💻 Programación Sobre Redes - 2025 👨‍💻
#### Benjamín Nehemías Castro Madrid 6to 1ra Computación
#### Correo: benjamin.castromadrid28et32@gmail.com

Este repositorio está dedicado a la materia **Programación sobre Redes**, dictada por el profesor **Gonzalo Nicolás Consorti** en la **Escuela General José de San Martín ET32**, ubicada en el Distrito Escolar 14. La materia se imparte durante el año **2025** y está enfocada en proporcionar una comprensión profunda de los conceptos fundamentales de las redes y la programación orientada a ellas.

## Consigna

Trabajo Práctico de Redes - Packet Tracer: Servidores, Subredes y Servicios

Trabajar con versión de PacketTracer 8.2.2

🎯Objetivo del Trabajo Práctico
Diseñar, configurar y probar una topología de red en Cisco Packet Tracer que integre:
 Redes cableadas e inalámbricas
 Direccionamiento IP estático y dinámico
 Implementación de distintos tipos de servidores (DNS, DHCP, FTP, SMTP y Web)
 Configuración de servicios de red esenciales en un entorno empresarial
La red simulará la infraestructura tecnológica de una clínica médica, organizada en áreas
funcionales distribuidas entre varios switches, con requerimientos de segmentación, acceso
diferenciado y servicios de comunicación interna y externa.
El objetivo es que el estudiante pueda aplicar los conocimientos adquiridos sobre modelado de
redes, configuración de dispositivos, gestión de servicios, asignación de roles y resolución de
nombres, en un entorno que represente una situación real y escalable.

🏢Organización Física y Lógica en Packet Tracer
Además del diseño lógico de la red, se deberá replicar su representación física utilizando las
herramientas de Packet Tracer, para simular un entorno profesional de redes empresariales.

🏬Distribución por Edificio y Piso
La clínica está dividida en dos edificios (Sucursal 1 y Sucursal 2), cada uno con dos pisos
funcionales, que contienen las distintas redes conectadas a sus respectivos switches.

Sucursal Piso Switch Nombre sugerido
Sucursal 1 Planta Baja SW1 Sw_Pb_Suc1
Sucursal 1 Primer Piso SW2 Sw_1ro_Suc1
Sucursal 2 Planta Baja SW3 Sw_Pb_Suc2
Sucursal 2 Primer Piso SW4 Sw_1ro_Suc2

🧱Capa Física – Requisitos
1. Edificios y pisos:
o Cada switch debe estar ubicado en el piso correspondiente del edificio
asignado.
o Utilizar los elementos de Packet Tracer para representar pisos y edificios
(pueden usar etiquetas, textos o agrupaciones visuales).

Trabajo Práctico de Redes - Packet Tracer: Servidores, Subredes y Servicios

Trabajar con versión de PacketTracer 8.2.2

2. Racks:
o Todos los dispositivos de red (Switches, Access Points, Servidores) deben estar
montados en racks bien organizados.
o Usar racks separados para los Access Points, si es necesario, para mejorar la
cobertura inalámbrica.
o Opcional: pueden agregar UPS o equipos decorativos si lo consideran
relevante.
3. Cableado:
o Utilizar diferentes colores de cables por red o subred para facilitar la lectura.
o Los cables deben estar ordenados, sin cruces innecesarios, y bien distribuidos
dentro del rack.

🧠Capa Lógica – Organización
1. Clusters:
o En la vista lógica, agrupar mediante Clusters lo siguiente:
 Cada Sucursal completa (SW1+SW2 o SW3+SW4 con sus PCs).
 Cada Switch con sus PCs en un subcluster dentro de su sucursal.
 Asignar colores distintos a cada cluster para facilitar la comprensión
visual.
2. Nombre de dispositivos:
o Todos los dispositivos deben estar correctamente nombrados, siguiendo el
formato:

🔧Topología General de Toda la Red:
 4 switches principales (SW1, SW2, SW3 y SW4).
 Cada switch gestiona 2 redes cableadas distintas:
o Las primeras 10 interfaces (FastEthernet 0/1 a 0/10) para la Red A.
o Las siguientes 10 interfaces (FastEthernet 0/11 a 0/20) para la Red B.
o Si es necesario, achicar la cantidad de interfaces para colocar las 5 redes
pedidas por sucursal (wifi’s)
o Los puertos GigabitEthernet se utilizarán para contactar SW1 con SW2 y SW3
con SW4

Trabajo Práctico de Redes - Packet Tracer: Servidores, Subredes y Servicios

Trabajar con versión de PacketTracer 8.2.2

o En lo posible usar los GigabitEthernet restante para conectar servidores, en
caso de no poder, usar los últimos puertos FastEthernet 0/20 a 0/24

 Cada switch seccional gestiona 2 redes inalámbrica en común para la sucursal:
o Cada AP se conecta a una de las bocas disponibles de la red correspondiente.
o 1 subRed inalámbrica compartida por todas las redes cableadas de SW1-
SW2, otra para el SW3-SW4
o Deberá tener su propia subred.
o Conectar dos Access Point por switch (12 AP en total), uno por red cableada,
pero todos configurados para la misma red Wifi por sucursal.

🖥️Redes de SW1 y SW2 (Clase A - IP Estática):

✅Estructura:
 2 switch seccionales (conectados entre sí en cascada), con:
o 2 PCs cableadas por subRedes
o 1 Access Point por subRedes (AP) (de una sucursal mismo SSID).
o 1 notebook por subredes
 Cada Switch seccional dividir en partes necesarias sus interfaces de red para tener 2
subRedes cableadas + la una wifi (AP)
 Total, de quipos por sucursal:
o 2 switch
o 4 AccesPoint
o 8 PC cableadas
o 4 notebook

📌Direccionamiento:
 Cada alumno deberá ver que red le toco de clase A para trabajar.
 Reservar la 1° IP de host disponible de cada red como Puerta de Enlace.
 Asignar direcciones IP estáticas.

Trabajo Práctico de Redes - Packet Tracer: Servidores, Subredes y Servicios

Trabajar con versión de PacketTracer 8.2.2

 Hacer el cálculo de SubNeting para 6 subRedes de igual tamaño (wifi, servidores,
médicos, rrhh, directivos,enfermeros)
 Colocar una etiqueta en cada red con los datos calculados (la subred y la PC)
o Ejemplo de etiquetas:
 Subred_1 (rrhh): 172.17.0.0 /19
 IP: 172.17.0.2

 Todas las PC y Servidores configurarlas en una sola subred (en la subred de
Servidores)
 Reservar las primeras IPs de la subred servidores para:
o 1° para el servidor SMTP
o 2° para el servidor FTP
o 3°, 4° y 5° para los servidores web
 Configurar máscara, puerta de enlace y DNS.

El servidor DNS no estará en esta parte de la red, pero deberá estar configurado
como si existiera, apuntando al servidor DNS de las otras redes.

📶Red WiFi compartida:
 Una subred (wifi) inalámbrica compartida para toda la sucursal.
 Configurar los Access Points para usar la misma SSID y Password.
 La cobertura de red debe ser solo la mitad del piso por AP.
 Deben tener usuario FTP y SMTP configurado igual que las PCs cableadas.
 Las PCs inalámbricas deben conectarse mediante los AP configurados en cada switch.
 La cobertura de red debe ser solo la mitad del piso.

🌐Servidores web (por red):
En esta sucursal, se acedera a los servidores web por su IP, no por su DNS (aunque debe ser
configurado igual).
Este conjunto de 5 redes debe tener 3 servidores web configurados con nombres y
contenido diferenciados:
Servidor Web Nombre DNS Funcionalidad
Página
Institucional web-clinica.org

Sitio institucional de la clínica (información general,
contacto, misión/visión).

Panel de
Médicos

medicos.clinica.
org

Login con autenticación, acceso a historias clínicas,
turnos, recetas.

Panel de RRHH rrhh.clinica. org

Login con autenticación, gestión de personal, legajos,
altas/bajas de empleados.

Trabajo Práctico de Redes - Packet Tracer: Servidores, Subredes y Servicios

Trabajar con versión de PacketTracer 8.2.2

📨Servidor SMTP:
 Este servidor se encargará del envío de correos internos entre las PCs del mismo
bloque (SW1 y SW2).
 Debe configurarse para permitir envío entre usuarios configurados en las PCs.
 Todas las PC de las 5 redes deben quedar configuradas para envió/recepción de email
 El dominio es clínica.org
 Cada usuario creado debe tener:
o Nombre de usuario
o Contraseña
o Buzón de correo asociado
o Ejemplo:

📁Servidor FTP:
 El servidor FTP debe permitir subir y descargar archivos por parte de las PCs
conectadas.
 Debe contener al menos un archivo compartido con archivos de prueba.
 Cada usuario debe tener una cuenta con:
o Nombre de usuario
o Contraseña

Dispositivo Usuario SMTP Name PC
PC1 rrhh1 RRHH
PC2 rrhh2 RRHH
PC3 medico1 Médico
PC4 medico2 Médico
PC5 dir1 Directivo
PC6 dir2 Directivo
PC7 enfer1 Enfermería
PC8 enfer2 Enfermería
Laptop1 (WiFi) wifi1 Médico
Laptop2 (WiFi) wifi2 RRHH

Trabajo Práctico de Redes - Packet Tracer: Servidores, Subredes y Servicios

Trabajar con versión de PacketTracer 8.2.2

o Permisos de lectura y escritura
Rol Permisos Descripción
RRHH

Lectura / Eliminar /
Listar Acceso a carpetas de personal, altas/bajas, contratos, etc.

Directivo Lectura / Escritura /

Listar

Acceso a informes generales, estratégicos, y documentos
de gestión.

Médico Solo Lectura / Listar Acceso a fichas médicas, recetas, historial clínico, etc.
Enfermería Listar

Puede consultar información médica pero no modificarla
ni subir archivos.

🔄Redes de SW3 y SW4 (Clase B - IP Dinámica DHCP):

✅Estructura:
 2 switch seccionales (conectados entre sí en cascada), con:
o 2 PCs cableadas por subRedes
o 1 Access Point por subRedes (AP) (de una sucursal mismo SSID).
o 1 notebook por subredes
 Cada Switch seccional dividir en partes necesarias sus interfaces de red para tener 2
subRedes cableadas + la una wifi (AP)
 Total, de quipos por sucursal:
o 2 switch
o 4 AccesPoint
o 8 PC cableadas
o 4 notebook

📌Direccionamiento:
 Cada alumno deberá ver que red le toco de clase B para trabajar.
 Reservar la 1° IP de host disponible de cada red como Puerta de Enlace.

Trabajo Práctico de Redes - Packet Tracer: Servidores, Subredes y Servicios

Trabajar con versión de PacketTracer 8.2.2

 Direccionamiento entregado automáticamente por servidor DHCP a todas las PC
 SubNetear en 6 subRedes de igual tamaño (wifi, servidores, médicos, rrhh, directivos,
enfermería)
 Colocar una etiqueta en cada red con los datos calculados (la subred y la PC)
o Ejemplo de etiquetas:
 Subred_1 (rrhh): 172.17.0.0 /19
 IP: 172.17.0.2

 Todas las PC y Servidores configurarlas en una sola subred (en la subred de Servidores)
 Armar los 6 pool de DHCP en el servidor
 Reservar las primeras IPs estáticas de la subred servidores para:
o 1° para el servidor DNS
o 2° para el servidor DHCP
o 3°, 4° y 5° para los servidores web
 Configurar máscara, puerta de enlace y DNS.

📡Red WiFi compartida:
 Una subred (wifi) inalámbrica compartida para toda la sucursal.
 Configurar los Access Points para usar la misma SSID y Password.
 La cobertura de red debe ser solo la mitad del piso por AP.
 Deben tener usuario FTP y SMTP configurado igual que las PCs cableadas.

🌐Servidores:
🖧 Servidor DHCP (Centralizado):
 Un único servidor DHCP para todas las redes de esta sucursal.
 6 scopes (uno por subRed) que deben incluir:
o Rango válido de IPs para las PCs (con reserva de primeras IP no disponibles)
o Gateway
o Mascara
o apuntar al servidor DNS (aunque este en otra red de otra sucursal)
o pool con cantidad de host correspondientes establecidas
 El servidor DHCP también debe manejar las IPs de la red WiFi compartida.

Trabajo Práctico de Redes - Packet Tracer: Servidores, Subredes y Servicios

Trabajar con versión de PacketTracer 8.2.2

🌍Servidor DNS (Interno):
 Debe poder resolver nombres de todos los servicios internos de la clínica (de las 5
redes de los SW1 SW2 SW3 SW4).
 Configurar zonas directas para los siguientes nombres:
o web-clinica.org
o medicos.clinica.org
o directivos.clinica.org
o IPs internas de servidores FTP/SMTP/DHCP/DNS

🌐Servidores Web – Características por función:
Cada servidor debe estar instalado en una máquina distinta. Las funciones son:

Servidor Web Nombre DNS Funcionalidad
Página
Institución web-clinica.org Página institucional de acceso libre (público)
Panel de
Médicos medicos.clinica.org

Login con autenticación, vista médica (consultas,
pacientes)

Panel Directivo directivos.clinica.org

Login con autenticación, vista de reportes y gestión
de personal

🧑💻Desarrollo de Sitios Web (HTML + CSS) – Servidores Web
Se solicita que para cada servidor web implementado, los estudiantes diseñen e integren un
pequeño sitio web funcional, utilizando únicamente HTML y CSS (compatible con el servidor
HTTP de Packet Tracer).
✅Requisitos generales:
 Los archivos deben estar ubicados en el directorio del servidor web correspondiente
dentro de Packet Tracer.
 Deben tener al menos:

Trabajo Práctico de Redes - Packet Tracer: Servidores, Subredes y Servicios

Trabajar con versión de PacketTracer 8.2.2

o Un archivo index.html
o Un archivo style.css
 Todo el contenido debe estar bien vinculado (rutas relativas).
 No se requiere JS ni formularios funcionales (pero sí simulación visual de
login/paneles).
 Se puede usar imágenes livianas (formato .jpg, .png, .gif), siempre embebidas
correctamente.

🗂 Estructura de los sitios web requeridos

Servidor Web Nombre DNS Contenido mínimo requerido
Página
institucional web-clinica.org

Página de inicio con información general de la clínica,
presentación de servicios, imágenes, misión y datos de
contacto.

Panel Médicos medicos.clinica.

org

Login visual + redirección a un panel donde se muestren
pacientes en tabla (nombre, DNI, diagnóstico).
Identificación clara del sector ("Panel Médico").

Panel RRHH rrhh.clinica. org

Login visual + redirección a un panel con tabla completa
del personal (nombre, puesto, sector, legajo). Título claro
"Panel de Recursos Humanos".

Panel
Directivos

directivos.clinica.
org

Login visual + redirección a un panel con sección de
finanzas (puede incluir tablas con gastos por sucursal,
gráfico simulado, resumen financiero).

🔒 Login unificado (simulado)
 Todos los sitios que requieren autenticación (RRHH, Médicos, Directivos) deben
compartir una misma pantalla de login estática (mismo diseño).
 Al hacer clic en “Iniciar sesión”, el botón debe redirigir visualmente al panel
correspondiente (panel.html u otro nombre interno).
 El login no tiene que funcionar realmente, pero debe estar bien estructurado.


## Objetivo del repositorio

El objetivo principal de este repositorio es ofrecer un espacio centralizado donde podrás encontrar todo el material confeccionado durante el curso, incluyendo:
    
-   **Ejercicios prácticos**: Una serie de ejercicios y actividades que ayudarán a afianzar los conocimientos adquiridos, con soluciones detalladas para que puedas aprender de manera efectiva.
    
-   **Proyectos y entregas**: Los proyectos y entregas que forman parte de la evaluación del curso. Cada proyecto estará acompañado de documentación que explica los objetivos, el código, y los resultados esperados.
    
-   **Recursos adicionales**: Material extra que el profesor Gonzalo Nicolás Consorti ha proporcionado para complementar la enseñanza. Esto incluye artículos, tutoriales, y enlaces a recursos externos relacionados con la programación en redes.

## Estructura
Este repositorio se ira actualizando a medida que las clases con el profesor se vayan dictando durante el año presente. Actualmente la estructura es la siguiente
 - **main**
 - **GuiaEjercicios-1_2025** -- Aquí podrás encontrar los ejercicios de la primer guía.
	 - guia_Ejercicios_1 

## Conclusión
Este repositorio recompila todo tipo de información adquirida durante mi instancia en la materia y en la escuela.
En especial, el lenguaje de programación JAVA.
![(https://static.wixstatic.com/media/ff9d7d_6c4add613f9142998981fa424cf843b8~mv2.png/v1/fill/w_1046,h_654,al_c,q_90,usm_0.66_1.00_0.01,enc_avif,quality_auto/ff9d7d_6c4add613f9142998981fa424cf843b8~mv2.png)](https://static.wixstatic.com/media/ff9d7d_6c4add613f9142998981fa424cf843b8~mv2.png/v1/fill/w_1046,h_654,al_c,q_90,usm_0.66_1.00_0.01,enc_avif,quality_auto/ff9d7d_6c4add613f9142998981fa424cf843b8~mv2.png)

