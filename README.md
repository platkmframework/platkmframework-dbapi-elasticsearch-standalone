# platkmframework-dbapi-elasticsearch-standalone

DbApi es un middleware de persistencia para base de datos relacionales y no relaciones.

Le permite realizar operaciones sobre registros de la base de datos, por lo que no necesita realizar programación adicional.


APIs
Crear un documento
-------------------------------------------------------------------------------------------------------------
POST: http://server:port/platkmframework/dbapi/create?index=<index name>

donde:
server: servidor del middleware.
port:puerto del middleware.
<index name>: nombre de la colección de documentos.

body: json con la información del documento a insertar.

Buscar un documento
GET: http://server:port/platkmframework/dbapi/load?index=<index name>&value=<id>

donde:
server: servidor del middleware.
port:puerto del middleware.
<index name>: nombre de la colección de documentos.
<id>: identificador del documento.


Actualizar un documento
---------------------------------------------------------------------------------------------------------
PUT: http://server:port/platkmframework/dbapi/update?index=<index name>&value=<id>

donde:
server: servidor del middleware.
port:puerto del middleware.
<index name>: nombre de la colección de documentos.
<id>: identificador del documento.

body: json con la información del documento a actualizar.

Eliminar un documento
-----------------------------------------------------------------------------------------------------------
DELETE: http://server:port/platkmframework/dbapi/load?index=<index name>&value=<id>

donde:
server:servidor del middleware.
port:puerto del middleware.
<index name>: nombre de la colección de documentos.
<id>: identificador del documento.
