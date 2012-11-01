SRC=src
CLS=cls
NAME=meme
JARFILE=$(NAME).jar
MANIFEST=Manifest.txt

all:
	javac -d $(CLS) src/*.java

jar:
	jar -cvfm $(JARFILE) $(MANIFEST) -C $(CLS)/ .

build: all jar
	@chmod +x $(JARFILE)

package: build clean
	tar czf $(NAME).tar.gz --exclude=.git ./*

clean:
	rm -f $(CLS)/*.class
	rm -f $(SRC)/*.class
	rm -f *.tar.gz
