<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<html>
    <head>
        <title>creat</title>
    </head>
    <body>
        <label>新增用户</label>
        <form action="creat" method="POST">
            <label>username</label>
            <input type="text" name="username" ></br>
            <label>mebile</label>
            <input type="text" name="mobile"></br>
            <label>vpmn</label>
            <input type="text" name="vpmn"></br>
            <label>email</label>
            <input type="text" name="email"></br>
            <label>home address</label>
            <input type="text" name="home_address"></br>
            <label>office address</label>
            <input type="text" name="office_address"></br>
            <label>groups</label>
            <input type="text" name="groups"></br>
            <label>job</label>
            <input type="text" name="job"></br>
            <label>job leve</label>
            <input type="text" name="job_level"></br>
            <label>memo</label>
            <input type="textarea" rows="10" cols="30" name="memo"></br>
            <label>submit</label>
                <input type="submit" value="creat">    
        </form>
    </body>
</html>
