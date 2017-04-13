

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Home page</title>
</head>
<body>
<table border="1">
    <#list allpermission as nameProject,repo>
        <tr>
            <th>${nameProject}</th>
            <th></th>
            <#list allUsers as users>
            <th>${users}</th>
            </#list>
    </tr>
        <#list repo as nameRepo, resultPermission>
        <tr>

            <th style="visibility: hidden"></th>
            <th>${nameRepo}</th>
                <#list resultPermission as result>
            <th>${result}</th>
                </#list>
        </tr>
        </#list>
        <tr>
            <th height="10" style="visibility: hidden"></th>
        </tr>

    </#list>
</table>
</body>
</html>

