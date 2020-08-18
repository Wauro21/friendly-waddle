FLAGS = -g
JC 		= javac
jvm		= java



.SUFFIXES: .java .class

.java.class:
	$(JC) $(FLAGS) $*.java
CLASSES = \
	Testfile.java \
	tableboard/*.java


default: build #Calls the compiler routine

build: $(CLASSES:.java=.class)

clean:
	rm *.class
	rm tableboard/*.class
