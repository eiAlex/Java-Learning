Desistalar java ubuntu

apt-get install ppa-purge -y
ppa-purge ppa:webupd8team/java
apt-get update
apt-get autoremove
apt-get autoclean


#Se estiver com a Open JDK instaladada remove
sudo apt-get purge openjdk*
#Add repositorio WebUpd8
add-apt-repository ppa:webupd8team/java
#Atualiza o APT
apt-get update
#Instala o Java8
apt-get install oracle-java8-installer
#Configura automaticamente as variaveis de ambiente
sudo apt-get install oracle-java8-set-default
#Checa a versão
javac -version
java -version
