BACKEND_SRC  := $(shell find backend/src/main -name "*.java")
FRONTEND_SRC := $(shell find frontend/src/main -name "*.java")

.PHONY: compile run clean

compile:
	mkdir -p out/backend out/frontend
	javac -encoding UTF-8 -d out/backend $(BACKEND_SRC)
	javac -encoding UTF-8 -cp out/backend -d out/frontend $(FRONTEND_SRC)

run: compile
	java -cp out/backend:out/frontend presentacion.Main

clean:
	rm -rf out
