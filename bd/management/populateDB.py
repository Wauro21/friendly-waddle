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
        response = input("El archivo BD no existe, desea crearlo Y/N?")
        if((response.lower()) == "y"):
            link = sqlite3.connect(nameDB+".db")
            print("BD creada y conexion establecida!")
            return link
        else:
            return None
# - Inicio
nameDB = input("Ingrese el nombre de la base de datos, sin extension: ")
connect(nameDB)
