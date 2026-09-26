# Ejercicio 4 - Temario C: Dulce Estación
## Análisis

1. **Objetivo**\
Crear un sistema que le permita al personal de Dulce Estación registrar máquinas, consultar inventario, cotizar, confirmar alquileres, registrar devoluciones y ver reportes.

2. **Entradas y salidas**\
Entradas: datos de la máquina, código de inventario, días de alquiler y confirmación o cancelación.\
Salidas: menú, inventario, cotizaciones, disponibilidad, reportes y mensajes de confirmación o error.

3. **Condiciones y restricciones**\
Los códigos no podrán estar vacíos ni repetidos. Los valores numéricos serán positivos; los días, potencias y porciones serán enteros.

   El costo será la tarifa diaria por los días, más los recargos: Popcorn con carrito, Q40 diarios; Algodon de más de 1000 W, Q60 por alquiler; Chocolate, Q20 por kg de capacidad por día.

   Solo se alquilarán máquinas disponibles y se devolverán las alquiladas. Solo confirmar un alquiler aumentará los ingresos.

   Se iniciará con dos máquinas por categoría, disponibles y sin ingresos. Las entradas inválidas no cerrarán el programa. Los montos tendrán dos decimales y los datos se guardarán solo durante la ejecución.

4. **Clases y responsabilidades**\
Existirán tres tipos de máquina: Popcorn, Chocolate y Algodon, basadas en la clase padre Maquina. La clase Alquileres administrará el inventario y los alquileres. 

