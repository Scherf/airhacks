# Build
mvn clean package && docker build -t com.airhacks/znueni .

# RUN

docker rm -f znueni || true && docker run -d -p 8080:8080 -p 4848:4848 --name znueni com.airhacks/znueni 