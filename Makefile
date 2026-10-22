SRC := $(shell find src -name "*.java")

.PHONY: compile run clean

compile:
	mkdir -p out
	javac -encoding UTF-8 -d out $(SRC)

run: compile
	java -cp out presentacion.Main

clean:
	rm -rf out