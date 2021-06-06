Algoritmo edadmayoy_menor
	edadmayor <- 0
	edadmenor <- 0
	i <- 1
	n <- 5
	Escribir 'Bienvenido al sistema de edad mayor o menor '
	Mientras (i<=n) Hacer
		Escribir 'Escriba la edad # ',i
		Leer edadt
		Si (i==1) Entonces
			edadmayor <- edadt
			edadmenor <- edadt
		SiNo
			Si (edadt>edadmayor) Entonces
				edadmayor <- edadt
			FinSi
			Si (edadt<edadmenor) Entonces
				edadmenor <- edadt
			FinSi
		FinSi
		i <- i+1
	FinMientras
	Escribir 'La edad mayor es: ',edadmayor
	Escribir 'La edad menor es: ',edadmenor
FinAlgoritmo
