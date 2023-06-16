// genere un programa que muestre por pantalla la relacion de numeros del 1 al 10
Algoritmo Programa1
	Definir num Como Entero
	num <- 1
	Mientras (num <= 10) Hacer
		Escribir num
		num <- num + 1
	FinMientras
FinAlgoritmo


//Permita ostrar por pantalla lla sumatoria de los 10 primero numeros pares
Algoritmo Programa2
	Definir  suma Como Entero
	suma <- 0
	Definir i Como Entero
	i <- 1
	Definir c Como Entero
	c  <- 0
	
	Mientras (i <= 10) Hacer
		c <- c + 2
		suma <- suma + c
		i <- i +1
	FinMientras
	
	Escribir suma
FinAlgoritmo


// permita mostrar por pantala la sumatpria de todos los numeros comprendidos entre un rango incluyendo al numero inicial y al final
Algoritmo Programa3
	Definir min, max, suma Como Entero
	Escribir "Primer numero: "
	Leer min
	Escribir "Segundo numero: "
	Leer max
	
	Mientras min <= max Hacer
		Escribir min
		suma <- min + suma
		min <- min + 1
	FinMientras
	
	Escribir  suma
FinAlgoritmo


//que permita calcular el salario de n trabajadpres preguntandole a cada uno de ellos el numero de horas trabajadas y la tarifa por hora. Asi mimso el programa debera calcular el total de la planilla de pago
Algoritmo Program4
	Definir i, n, total, horas, costo, salario como Entero
	Escribir "Cuantos trabajaores tiene"
	leer n
	total <- 0
	
	i <- 0
	Mientras i < n Hacer
		Escribir "Escriba su numero de horas: " 
		Leer horas
		Escribir  "Cuanto gana por hora: "
		Leer costo
		salario <- horas * costo
		
		Escribir "Usted gana: ", salario
		total <- total + salario
		
		i <- i + 1
	FinMientras
	
	Escribir "Total a pagar", total
	
FinAlgoritmo


//llenar 5 cajas con 10 pelotas cada una . De modo q primero se llene la primera caja luego la segunda caja y asi sucesivamente

Algoritmo Programa5
	Definir box, ball Como Entero
	box <- 1
	ball <- 1
	
	Mientras box <= 5 Hacer
		ball <- 1
		Escribir "Caja ", box, ": "
		Mientras ball <= 10 Hacer
			Escribir "		Pelota ", ball
			ball <- 1 + ball
		FinMientras
		box <- 1 + box
	FinMientras
FinAlgoritmo


// Que permita solicitar a un usuario una clave de acseso y que no le permita continuar hasta que introdusca la clave correcta 
Algoritmo Programa6
	Definir key Como Caracter
	
	Repetir
		Escribir "Inigresa la clave"
		Leer key
	Hasta Que (key = "unsa") 
	
	Escribir "Bienvenido"
FinAlgoritmo


// tabla de multiplcia autoatica hasa el numero 12 ingresado por teclado

Algoritmo Program8
	Definir num Como Entero
	Leer  num
	Para i <- 1 Hasta 12
		Escribir num, " * ", i, " = ", num * i 
	FinPara
FinAlgoritmo




/ Que permita solicitar a un usuario una clave de acseso y que no le permita continuar hasta que introdusca la clave correcta 
Algoritmo Programa6
	Definir key Como Caracter
	Definir  intentos Como Entero
	Definir bucle, ingreso Como Logico
	bucle <- falso
	ingreso <- falso
	intentos <- 3
	Repetir
		Escribir "Numero de intentos: ", intentos
		Escribir "Inigresa la clave"
		Leer  key
		si (key = "UNSA" o key = "AQP" o key ="SIS") Entonces
			bucle <- Verdadero
			ingreso <- Verdadero
		FinSi
		intentos <- intentos -1 
		si intentos < 1 Entonces
			bucle <- true
			Escribir "a"
			ingreso <- Falso
		FinSi
	Hasta Que (bucle) 
	
	si ingreso Entonces
		Escribir "Bienvenido"
	SiNo
		Escribir "No esta autorizado"
	FinSi
FinAlgoritmo
