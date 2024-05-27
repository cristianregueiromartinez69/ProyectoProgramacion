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
2. Realizacion de los metodos de la interfaz de la suerte
3. Realizacion de más botones para la interfaz de la suerte
4. Realizacion de la interfaz de seleccion de pokemons
5. Realizacion de la lógica de la interfaz de seleccion de pokemons


***Explicacion de el funcionamiento de la interfaz de la suerte***
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

***explicacion del funcionamiento de la interfaz de seleccion de pokemon***
Una vez ya tenemos ganador del sorteo, vamos con la seleccion de pokemons
1. El ganador tiene que escoger a los 3 pokemos para la batalla
2. una vez escoja a los 3 pokemons, le toca al oponente
3. Si los 2 han escogido a los 3 pokemons, le podrán dar al boton de finish e ir a la batalla pokemon
4. Los datos se guardan en un hashmap en el cual la clave es el alias del jugador y el valor es un arraylist de objetos de tipo pokemons


Chema:
1. Implementación de la base de datos en el proyecto

***Semana 3 del proyecto***
Esta semana nos toca ponernos las botas, ya que toca hacer la interfaz más dificil de todas, la batalla pokemon.

Cristian:
1. Haciendo gran parte de la interfaz de batalla pokemon
2. añadiendo paneles para el jugador 1 de ataque y cambio de pokemon
3. añadiendo peneles para el jugador 2 de ataques y cambio de pokemons
4. añadiendo la barra de vida del pokemon en batalla del jugador 1
5. añadiendo la barra de vida del pokemon en batalla del jugador 2
6. La barra de vida es una JProgressbar y es posible que se cambie por otra cosa
7. añadiendo un text area con la información de la batalla pokemon
8. añadiendo el escenario de batalla con un pokemon a un lado y otro al otro lado
9. añadiendo una imagen del pokemon para el jugador 1 y otro para el jugador 2 en el escenario
10. Realizando formula de daño pokemon
11. actualizando todo al cambio
12. Realizando muchos metodos para la interfaz batalla

chema:
1. terminando implementacion de la base de datos
2. actualizando datos de los pokemons con la base de datos
3. añadiendo los ataques de la base de datos a los pokemons
4. modificando atributos de los pokemons

***explicacion de la interfaz batalla***
cuando los 2 jugadores han escogido a sus 3 pokemons, nos vamos a la batalla
1. el jugador 1 esta a la izquierda y el 2 a la derecha
2. los 2 jugadores tienen ataques para hacer y pueden cambiar de pokemon
3. cuando se cambia de pokemon, se actualizan todos los datos
4. La formulas de daño esta hecha, falta implementarla para reducir la vida del oponente
5. será un combate por turnos y cuando los 3 pokemons de un rival mueran, habrá un ganador

**problemas encontramos**
El principal de todos, la barra de vida. Me está costando mucho actualizarla bien con la progressbar, quizas haya que poner otra cosa, pero se intentará hasta el final

***Semana 4 del proyecto***
Un punto más de nuestro proyecto será gracias a alejandro. Hemos arreglado la barra de vida.

Cristian:
1. Arreglando la barra de vida
2. haciendo que le bajes daño al oponente
3. haciendo que se actualice la barra de vida
4. haciendo que al cambio se actualice la barra de vida
5. haciendo sonido de ataques de los pokemons
6. haciendo sonido de cambio de pokemon
7. haciendo metodos para cuando mueran pokemons
8. haciendo metodos para cuando se acabe la batalla
9. incorporando muchos sonidos al proyecto
10. Arreglando muchos bugs del proyecto, entre ellos:
11. Arreglando el bug de no repetir alias
12. Arreglando el bug de no robar pokemons
13. Arreglando el bug de no seleccionar logo

chema:
1. implementacion acabada de la base de datos
2. arreglando errores de la base de datos
3. haciendo el hall of fame
4. haciendo metodos para el hall of fame
5. haciendo la interfaz del hall of fame

***explicacion de la interfaz battala (actualizada y acabada)***
Esta ha sido la interfaz más dificil de todas, pero la hemos acabado.
1. los 2 jugadores tienen 3 pokemons
2. los 2 jugadores tienen 4 ataques
3. los 2 jugadores pueden cambiar de pokemon
4. los 2 jugadores tienen una barra de vida
5. los 2 jugadores tienen un escenario de batalla
6. los 2 jugadores tienen un text area con la información de la batalla
7. los 2 jugadores tienen un sonido de ataque y cambio de pokemon
8. el pokemon más rapido ataca primero y luego le toca al otro
9. cuando un pokemon muere, se fuerza al cambio de pokemon
10. cuando los 3 pokemons de un jugador mueren, se acaba la batalla
11. cuando se acaba la batalla, se muestra el ganador en el hall de la fama

***problemas encontrados***
El unico problema encontrado, ademas de que nos
hubiera gustado incluir mas cosas en la batalla, como animaciones,
habilidades de los pokemons, objetos y demas cosas, pero por culpa del tiempo no se pudo,
está lo de que puedas cambiar al propio pokemon que está combatiendo, lo cual no se debería de poder XD.


