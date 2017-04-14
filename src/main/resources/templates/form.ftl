

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Home page</title>
</head>
<body>
<table border="1">
        <tr>
            <th style="visibility: hidden"></th>
            <th style="visibility: hidden"></th>
        <#list allUsers as users>
            <th>${users}</th>
        </#list>
        </tr>
    <#list allpermission as Project>
        <tr>
            <th>${Project.name}</th>
            <th></th>
            <#list Project.equailsProjectUsers as permissionsProjectUser>
            <th>${permissionsProjectUser}</th>
            </#list>

    </tr>

        <#list Project.repos as repo>
        <tr>

            <th style="visibility: hidden"></th>
            <th>${repo.name}</th>
                <#list repo.equailsUsersPermissions as result>
            <th>${result}</th>
                </#list>
        </tr>
        </#list>
    </#list>
</table>
</body>
</html>

