import sqlite3
import os.path
from os import path
def connect(nameDB):
    nameDB = nameDB+".db"
    if (path.isfile(nameDB)):
        print("Conexion con la DB: "+nameDB+" establecida!")
        link = sqlite3.connect(nameDB)
        return link
    else:
        response = input("El archivo BD no existe, desea crearlo Y/N? ")
        if((response.lower()) == "y"):
            link = sqlite3.connect(nameDB)
            print("BD creada y conexion establecida!")
            return link
        else:
            return None

def listTables(link):
    cursor = link.cursor()
    cursor.execute('SELECT name from sqlite_master where type= "table"')
    result = cursor.fetchall()
    size = len(result)
    if(size <= 1):
        print("¡No hay tablas presentes!")
    else:
        result = tableFetch2Array(result)
        for toPrint in result:
            print(toPrint)

def tableFetch2Array(result):
    #Removes the sqlite_sequence
    retorno = set()
    for i in range(len(result)):
        temp = result[i][0]
        if(temp != result[-1][0]):
            retorno.add(temp)
    return retorno

# - Inicio
nameDB = input("Ingrese el nombre de la base de datos, sin extension: ")
nexo = connect(nameDB)
listTables(nexo)
