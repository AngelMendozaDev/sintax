from os import system
import re

datos = []
matriz = []
filas = 0
columnas = 5
n = 0

def existe(matriz, x, filas):
    for i in range(filas):
        #print(str(type(matriz[i][0]))+""+str(matriz[i][0])+"---"+str(type(x))+str(x))
        if matriz[i][0].strip() == x:
            return True
    return False

def isOperation(text):
    flag = False
    pattern = re.compile("[a-zA-Z]+\s*=\s*[a-zA-Z0-9]+\s*(\+|\-|\*)\s*[a-zA-Z0-9]+;$")
    if pattern.match(text):
        print("coincide: ["+str(text).replace("\n", "")+"]")
        texta = re.split("\s*([;=+\-/*])\s*",text)
        #print(texta)
        #textAux = text.replace("+", '').replace("-", '').replace("=", '').replace(";", '').replace(" ", '')
        #print(textAux)
        for x in range(len(texta)):
            if(texta[x] != '+' and texta[x] != '-' and texta[x] != '/' and texta[x] != '*' and texta[x] != ';' and texta[x] != '=' and texta[x] != ''):
                aux = ""+texta[x]
                if existe(matriz, aux.strip(), filas) != True:
                    print("Error la variable:" +str(aux) +" No esta declarada")
                    flag = True
                    break
        if flag == False:
            print(" Expresion correcta...! \n\n")

#Llenamos la tabla de variables
system("java Principal prueba.c")
with open("vars.txt","r") as archivo:
    for linea in archivo:
        
        aux = linea.split(",")

        for dato in aux:
            datos.append(dato.replace("\n", ""))

filas = int(len(datos)/5)

for i in range (filas):
    matriz.append([])
    for j in range(columnas):
        matriz[i].append(datos[n])
        n+=1
"""print(datos)
print("-****************-")
print(matriz[1][0])"""

with open("temp.txt","r") as archivo:
    for linea in archivo:
        #print(linea)
        isOperation(linea)
