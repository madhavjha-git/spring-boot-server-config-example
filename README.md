# spring-boot-server-config-example

URL : http://localhost:8080/application/default

Content of application.yml:
my:
        greetings: Hello from config server
        list:
                values:
                        One, Two, Three
db:
        connection: connection-string-here
        host: 127.0.0.1
        port: 1200


Output:
{"name":"application","profiles":["default"],"label":null,"version":"3d44d31dfab67d87d33ef5f2773d64d768f7f723","state":null,"propertySources":[{"name":"/home/madhavj/code/appconfig/application.yml","source":{"my.greetings":"Hello from config server","my.list.values":"One, Two, Three","db.connection":"connection-string-here","db.host":"127.0.0.1","db.port":1200}}]}
