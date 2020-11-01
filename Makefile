FLAGS = -g
JC 		= javac
JVM		= java
CPTH 	= -classpath .:driver/sqlite-jdbc-3.32.3.2.jar

TEST	= Testfile

.SUFFIXES: .java .class

.java.class:
	$(JC) $(FLAGS) $*.java
CLASSES = \
	Testfile.java \
	tableboard/*.java \
	bd/*.java \
	games/*.java


default: build #Calls the compiler routine

build: $(CLASSES:.java=.class)

test:
	$(JVM) $(CPTH) $(TEST)

clean:
	rm *.class
	rm tableboard/*.class
	rm bd/*.class
	rm misc/*.class
	rm games/*.class
