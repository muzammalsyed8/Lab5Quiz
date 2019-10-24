<! DOC TYPE html>
<html>
<head>
  <link href="stylesheet.css" type="text/css" rel="stylesheet">
  <link href="bootstrap.min.css" type="text/css" rel="stylesheet">
</head>
<body style="background-color: darkslategray">
<hr>
<script>
  function ValidateData(){
      var id=document.getElementById("id").value;
    var username=document.getElementById("username").value;
    var password=document.getElementById("password").value;
    var dob=document.getElementById("dob").value;
    var email=document.getElementById("email").value;
      var phone=document.getElementById("phone").value;
      var fee=document.getElementById("fee").value;

    if((username="")||(password="")||(id="")||(phone="")||(fee="")||(dob="")||(email=""))
    {
      alert("Data is missing")

    }
    else if(validateEmail()){

    }
    else{}
  }

  function clearData(){

      var id=document.getElementById("id").value="";
      var username=document.getElementById("username").value="";
      var password=document.getElementById("password").value="";
      var dob=document.getElementById("dob").value="";
      var email=document.getElementById("email").value="";
      var phone=document.getElementById("phone").value="";
      var fee=document.getElementById("fee").value="";

  }

  function validateEmail(){
    var em=document.getElementById("email").value;

    if(/^\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}$/.test(em))
    {
      return(true);
    }
    else
    {
      alert("Email not matched");
      return(false);
    }

  }

  function validatePassword(){
      var pass=document.getElementById("password").value;

      if(/^\(?=.*[a-z](?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\$%\^&\*])(?=.{8,})/.test(em))
      {
          return(true);
      }
      else
      {
          alert("password should follow constraints");
          return(false);
      }

  }
</script>


<div class="main">
  <div class="one">
    <div class="register">
      <h1 style="color: #1d7097">Registration Form</h1>
      <form  action="MyServlet" method="post" id="reg-form" onsubmit="ValidateData()">
        <div style="align-content: flex-start; text-align: left">

            <div>
                <label for="id">Student ID </label>
                <input style="margin-left: 100px" name="id" type="number" size="50" maxlength="100" id="id" spellcheck="false" placeholder="Student ID" />
            </div>
            <br>

          <div>
            <label for="username">User Name </label>
            <input style="margin-left: 100px" name="username" type="text" size="50" maxlength="100" id="username" spellcheck="false" placeholder="User Name" />
          </div>
          <br>

          <div>
            <label for="password">Password </label>
            <input style="margin-left: 110px" name="password" type="password" size="50" id="password" placeholder="Password"/>
          </div>
          <br>

            <div>
                <label for="email">Email Address</label>
                <input style="margin-left: 75px" name="email" type="text" size="50" id="email" spellcheck="false" placeholder="Email Address"/>
            </div>
            <br>

          <div >
            <label for="dob"  >Date of Birth </label>
            <input style="margin-left: 85px" name="dob" type="date"  id="dob" spellcheck="false" placeholder="date of Birth"/>
          </div>
          <br>

            <div >
                <label for="phone"  >Phone </label>
                <input style="margin-left: 85px" name="phone" type="number"  id="phone" spellcheck="false" placeholder="Phone No"/>
            </div>
            <br>

            <div >
                <label for="fee"  >Fee </label>
                <input style="margin-left: 85px" name="fee" type="number"  id="fee" spellcheck="false" placeholder="Fee"/>
            </div>
            <br>

            <div >
                <label >Course </label>
                <input type="checkbox" id="course1" name="course1" value="java" checked> JAVA &nbsp
                <input type="checkbox" id="course2" name="course2" value="jdbc"> JDBC &nbsp
                <input type="checkbox" id="course3" name="course3" value="ejb" checked>EJB &nbsp
                <input type="checkbox" id="course4" name="course3" value="ejb" checked>JSP &nbsp
            </div>
            <br>

            <div >
                <label >Gender </label>
                <input type="radio" id="male" name="male" value="male" checked> Male &nbsp
                <input type="radio" id="female" name="female" value="female"> Female &nbsp

            </div>
            <br>
            <div>
            <select>
                <option value="Matriculation">Matriculation</option>
                <option id="fsc" value="FSc">FSc</option>
                <option  id="bs" value="BS">BS</option>
                <option id="ms" value="MS">MS</option>
                <option id="phd" value="PhD">PhD</option>
            </select>
            </div>
            <br>

          <div >
            <label></label>
            <input type="submit" value="Cancel" id="clear-form" class="button" onclick="clearData()"/>
            <label></label>
            <input type="submit" value="Register" id="create-account" class="button" onclick="validatePassword()"/>
          </div>
        </div>
      </form>


    </div>
  </div>
</div>

</body>
<hr>
</html>

