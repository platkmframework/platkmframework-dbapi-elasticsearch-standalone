# platkmframework-dbapi-elasticsearch-standalone

APIs
Crear un documento
POST: http://server:port/platkmframework/dbapi/create?index=<index name>

donde:
server: servidor del middleware.
port:puerto del middleware.
<index name>: nombre de la colección de documentos.

body: json con la información del documento a insertar.
-------------------------------------------------------------------------------------------------------------
Buscar un documento
GET: http://server:port/platkmframework/dbapi/load?index=<index name>&value=<id>

donde:
server: servidor del middleware.
port:puerto del middleware.
<index name>: nombre de la colección de documentos.
<id>: identificador del documento.

---------------------------------------------------------------------------------------------------------
Actualizar un documento
PUT: http://server:port/platkmframework/dbapi/update?index=<index name>&value=<id>

donde:
server: servidor del middleware.
port:puerto del middleware.
<index name>: nombre de la colección de documentos.
<id>: identificador del documento.

body: json con la información del documento a actualizar.
-----------------------------------------------------------------------------------------------------------
Eliminar un documento
DELETE: http://server:port/platkmframework/dbapi/load?index=<index name>&value=<id>

donde:
server:servidor del middleware.
port:puerto del middleware.
<index name>: nombre de la colección de documentos.
<id>: identificador del documento.
