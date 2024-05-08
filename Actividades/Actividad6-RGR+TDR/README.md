## Actividad RGR-TDD  
  
  
# 1) Comenzamos creando una prueba que falle  
  
  ![](img/01.png)  
    
   Obviamente las pruebas, es decir estamos en ROJO  
   ![](img/02.png)  
     
    
# 2) Pasamos a verde  
  
  ![](img/03.png)  
    
  Las pruebas ahora pasan es decir estamos en VERDE  
    
  ![](img/04.png)  
    
      
# 3) Refactorizamos, es decir pasamos a Azul  
  
  ![](img/05.png)  
    
   Se debe verificar que en esta refactorizacion las pruebas pasan  
     
  ![](img/06.png)  
    
# PRIMER CICLO TDD COMPLETADA  
  
# 1) Volviendo a Rojo  

  
Ahora procedemos a modificar FootballTeamTest añadiendo un test que admite varias parámetros:  
   
   ![](img/07.png)  
     
Al hacer eso, ese test va a fallar es decir estamos en ROJO de nuevo  
  
  ![](img/08.png)  
    
        
# 2) Pasando a verde  
  
  ![](img/09.png)  
    
   Notamos que el test parametrizado pasa, estamos en VERDE  
     
   ![](img/10.png)  
     
       
# 3) Refactorizando (pasando a AZUL)  
  
  ![](img/11.png)  
    
  Esto dara error pues el constructor de la clase FootballTeam actualmente acepta cualquier valor.La solución es sencilla:  
  
  ![](img/12.png)  
    
  Los test con esto cambios si pasan, es decir estamos en AZUL 
    
  ![](img/13.png)  
    
# SEGUNDO CICLO COMPLETADO  
  
#¿Pero es comparable?  
El constructor funciona bien. Ahora podemos pasar al problema principal: es decir, compararequipos de fútbol. En primer lugar, hemos decidido que vamos a usar la interfaz java.lang.Comparable  
  
  ![](img/14.png)  
  
  
# 1) Volviendo a Rojo  
Si FootballTeam es comparable,
entonces el cliente puede esperar que una vez que haya puesto unos cuantos equipos en una colección, podrá usar el método Collections.sort() para ordenarlos. Si es así, entonces debería haber una prueba para este comportamiento  
  
  ![](img/15.png)  
    
 Esta prueba fallará:  
   
   ![](img/16.png)  
     
# 2) Pasando a verde:
Creando el metodo compareTo  
  
   ![](img/17.png)  
     
    Vemos que los test ahora si pasan:  
      
   ![](img/18.png)  
     
# 3) Refactorizando  
En este caso no hay nada que refactorizar asi que automáticamente pasamos a AZUL  
  
# TERCER CICLO TDD COMPLETADO  
  
# 1) Volviendo a Rojo:       
     
Ahora escribamos la primera prueba de comparación. La idea es simple: tomar dos equipos con diferentes números de victorias y compararlos.  
  
  ![](img/19.png)  
    
  Las pruebas fallarán, volvemos a ROJO:  
    
  ![](img/20.png)  
    
# 2) Pasando a verde  
Hacemos una modiciación en compareTo:  
  
  ![](img/21.png)  
    
  ![](img/22.png)  
    
# 3) Refactorizando el compareTo y verificando que los test pasen  
  
  ![](img/23.png)  
  
  Los test pasan luego de la refactorización entonces estamos en azul  
    
  ![](img/24.png)  
    
# CUARTO CICLO TDD COMPLETADO  
  
# 1) Pasando Rojo:  
  
  ![](img/25.png)  
    
# 2) Pasando a verde  
  Modificando el metodo compareTo  
    
  ![](img/26.png)  
    
  Con esto el test pasará (VERDE)  
    
  ![](img/27.png)  
    
  Añadiendo un nuevo test, una prueba de igualdad (este pasará sin problema):  
    
  ![](img/28.png)
    
 Definitivamente hemos omitido un paso en el ritmo TDD. Nunca hemos visto esta prueba de igualdad fallar, así que no sabemos por qué pasa. ¿Por qué?
Para asegurarte de que tu prueba realmente verifica el escenario dado, y que tu código realmente pasa la prueba, necesitas hacer lo siguiente:  

-introduce un cambio en el código de producción que rompería la prueba,  

-ejecuta todas las pruebas y verifica que esta prueba particular falle,  

-revierte el cambio,  

-ejecuta todas las pruebas y verifica que esta prueba particular pase.  
  
  En nuestro caso, el cambio a introducir sería devolver algún otro valor que no sea 0 en la última línea del método compareTo(), por ejemplo:  
  
  ![](img/29.png)  
    
   Aqui el test fallará,  
     
   ![](img/30.png)
pero después de revertir la línea para devolver 0 podemos ver que todas nuestras pruebas pasan. Bien, nuestra prueba de igualdad está haciendo lo que debe!  
  
  ![](img/31.png)  
  ![](img/32.png)  
    
# 3) Refactorizando (AZUL)  
  
  ![](img/33.png)  
    
  ![](img/34.png)  
    
# JUAN SILVA

    
    
     


   
           
    
   
