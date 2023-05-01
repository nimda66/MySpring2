<!DOCTYPE html>
<html>
    <head>
        <title>Standards</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
    <h1>List of Standards</h1>

        <table>
            <tr>
                <th>Id</th>
                <th>Title</th>
                <th>Working Grem</th>
            </tr>

            <#list standards as standard>
                <tr>
                    <td>${standard.id}</td>
                    <td>${standard.title}</td>
                    <td>${standard.workingGrem}</td>
                </tr>
            </#list>
        </table>
    </body>
</html>
