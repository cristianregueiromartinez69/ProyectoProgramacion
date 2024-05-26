**Proyecto de programacion**
integrantes: José María Cao Baqueiro y Cristian Regueiro Martínez

***Semana 0 del proyecto***
__Planificacion__:
Cristian: Me encargué de hacer el diagrama de flujo del proyecto en el que se explicaba muy detalladamente todo el flujo de ejecución que iba a hacer el programa
Me encargué de hacer el pdf con todo lo que había que incluir en el proyecto, como las tencologías a utilizar, incluir el diagrama de flujo... entre otras

Chema: Se encargó de hacer el diagrama de clases (supér grande xD)

***Semana 1 del proyecto***
Las planificaciones las vamos a ir haciendo semana a semana.
En esta semana 1, nos hemos encargado de lo siguiente:
Cristian:
1. Realización de los botones de la interfaz de la clase del menú principal
2. Realización de la interfaz del menú principal
3. Realización de los botones de la interfaz de crear cuenta
4. Realización de los botones de la interfaz de suerte
5. Realización de los botones de la interfaz de selección de pokemons
6. Realización de los botones de la interfaz de combates
7. Realización de los botones de la interfaz de ataques
8. Realización de los botones de la interfaz de cambiar de pokemon
9. Realización de los botones de la interfaz del salón de la fama
10. Realización de un nuevo paquete con los paneles más grandes del proyecto
11. Realización de metodos pertenecientes a la interfaz de cambiar de pokemons o ataques
12. Añadir múltiples imágenes al proyecto
13. Realización de la interfaz de crear cuenta 
14. Realiación de los metodos de la interfaz crear cuenta
15. Empezando a hacer la interfaz de luck

***Explicación del funcionamiento de la interfaz crear cuenta***
Para poder hacer un combate, tienes que tener una cuenta creada.
1. pulsas el boton de crear cuenta en el menu de inicio
2. hay 2 bloques, el del jugador 1 y 2
3. introduces el alias que quieras y escoges un logo
4. Es obligatorio introducir ambas cosas
5. Si ya acabaste le das a el boton de listo
6. Una vez le diste al boton de listo, se bloquean todos los botones y esperas al jugador 2
7. Lo mismo para el jugador 2
8. Una vez acabaron los 2, le das al boton de finish
9. Se cierra la ventana

**Cuando le das a listo, se guarda la informacion seleccionada en un hashmap
1. la clave es el alias del jugador
2. el valor es el path del icono seleccionado

Chema:
1. Realizacion del paquete de pokemons
2. Realiacion de la clase Drampa con sus atributos, getters y setters
3. Realiacion de la clase Empoleon con sus atributos, getters y setters
4. Realiacion de la clase Garchomp con sus atributos, getters y setters
5. Realiacion de la clase Gengar con sus atributos, getters y setters
6. Realiacion de la clase Infernape con sus atributos, getters y setters
7. Realiacion de la clase Lucario con sus atributos, getters y setters
8. Realiacion de la clase Luxray con sus atributos, getters y setters
9. Realiacion de la clase Marshadow con sus atributos, getters y setters
10. Realiacion de la clase Milotic con sus atributos, getters y setters
11. Realiacion de la clase Snorlax con sus atributos, getters y setters
12. Realiacion de la clase Tinkaton con sus atributos, getters y setters
13. Realiacion de la clase Tyranitar con sus atributos, getters y setters
14. Realizacion de la interfaz de pokemon con los metodos que van a implementar las clases anteriores
15. Realización de la super clase pokemon de la cual van a haredar las clases anteriores
16. Criticar la imagen de fondo de la interfaz creaar cuenta XD

***Semana 2 del proyecto***
Esta semana nos toca seguir haciendo interfaces con su funcionalidad e implementar la base de datos

Cristian:
1. Realizacion de la interfaz cuenta
2. Realizacion de los metodos de la interfaz cuenta
3. Realizacion de más botones para la interfaz cuenta

***Explicacion de el funcionamiento de la interfaz***
La interfaz funciona de la siguiente manera:
1. para poder avanzar, tienes que tener una cuenta creada, si no no puedes jugar
2. Si creaste la cuenta, deberías poder introducir correctamente el usuario
3. Al introducirlo, tienes que seleccionar si quieres cara o cruz
4. El jugador 2 hará lo mismo
5. si ya has seleccionado cara y estás conforme con la eleccion, le das a enter
6. el jugador 2 hará lo mismo
7. El ganador del sorteo se decide de la siguiente manera:
si el jugador escoge cara, se le asigna el numero 1
si el jugador 1 escoge cruz, se le asigna el nunero 2
se genera un numero aleatorio entre el 1 y 2 
el numero escogido por el jugador 1 y 2 debe de ser igual al numero generado, de ahí sale el ganador
8. Una vez se conoce al ganador, sale una imagen del ganador del sorteo en el panel de winner
9. sale también un boton para ir a la seleccion de pokemons

***Problemas encontrados y a resolver en el futuro***
1. los botones de cara o cruz no consigo que salgan 2 para cada jugador
2. el posicionamiento de los botones y paneles no es el que me gustaría
3. Falta refactorizar bastante esa clase
4. Lo bueno es que funciona perfectamente y lo unico que nos importa de esa interfaz es saber el ganador del sorteo, el cual funciona perfectamente

Chema:
1. Implementación de la base de datos en el proyecto
