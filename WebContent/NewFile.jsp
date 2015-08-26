<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ordering</title>
<link rel="stylesheet" type="text/css" href="styles.css">
 
 <script type="text/javascript">       

        function handleWizardNext()

        {

          if (document.getElementById('ButtonNext').name == 'Step2')

            {

              
                document.getElementById('ButtonNext').name = 'Step3';

                document.getElementById('ButtonPrevious').name = 'Step1';
                
                document.getElementById('ButtonPrevious').disabled = '';

               document.getElementById('Step1').style.display = 'none';

                document.getElementById('Step2').style.display = '';

            }

            else if (document.getElementById('ButtonNext').name == 'Step3')

            {

                 document.getElementById('ButtonNext').name = 'Step4';

                document.getElementById('ButtonPrevious').name = 'Step2';

                document.getElementById('Step2').style.display = 'none';

                document.getElementById('Step3').style.display = '';

              
            }
            else if (document.getElementById('ButtonNext').name == 'Step4')

            {

                document.getElementById('ButtonNext').name = '';

                document.getElementById('ButtonPrevious').name = 'Step3';
                
                document.getElementById('ButtonNext').disabled='disabled';
                
                document.getElementById('SubmitFinal').disabled='';
              
                document.getElementById('Step3').style.display = 'none';

                document.getElementById('Step4').style.display = '';
             
                loadStep5Review();

            }
        }

        

        function handleWizardPrevious()

        {

        		if (document.getElementById('ButtonPrevious').name == 'Step1')

           		 {

                 document.getElementById('ButtonNext').name = 'Step2';

                document.getElementById('ButtonPrevious').name = '';
                
                document.getElementById('ButtonPrevious').disabled = 'disabled';

                document.getElementById('Step2').style.display = 'none';

                document.getElementById('Step1').style.display = '';

                

            }

            else if (document.getElementById('ButtonPrevious').name == 'Step2')

            {
				 document.getElementById('ButtonNext').name = 'Step3';

                document.getElementById('ButtonPrevious').name = 'Step1';

                
                document.getElementById('Step3').style.display = 'none';

                document.getElementById('Step2').style.display = '';

                

            }
            else if (document.getElementById('ButtonPrevious').name == 'Step3')

            {

                 document.getElementById('ButtonNext').name = 'Step4';

                document.getElementById('ButtonPrevious').name = 'Step2';

               

                document.getElementById('ButtonNext').disabled = '';

                document.getElementById('SubmitFinal').disabled = 'disabled';

                

                document.getElementById('Step4').style.display = 'none';

                document.getElementById('Step3').style.display = '';

              
          
            }

        }

        
      
        function loadStep5Review()

        {

            document.getElementById('viewfirstname').innerHTML = document.getElementById('firstName').value;
            //var e=document.getElementById("service");
           // var servicetype=e.options[e.selectedIndex].text;

           // document.getElementById('viewservice').innerHTML = servicetype;
            var f=document.getElementById("product");
            var productname=f.options[f.selectedIndex].text;

            document.getElementById('viewproduct').innerHTML = productname;
            
            document.getElementById('viewbillingaddress').innerHTML = document.getElementById('TextAddressLine1B').value +" , " + document.getElementById('TextAddressLine2B').value +" , "+ document.getElementById('TextCityB').value +" , "+ document.getElementById('TextStateB').value +" , "+  document.getElementById('TextZipCodeB').value ;
            
          //  document.getElementById('viewshippingaddress').innerHTML = document.getElementById('TextAddressLine1ship').value +" , "+document.getElementById('TextAddressLine2ship').value+" , "+document.getElementById('TextCityship').value+" , "+document.getElementById('TextStateship').value+" , "+document.getElementById('TextZipCodeship').value;
            
            document.getElementById('viewserviceaddress').innerHTML = document.getElementById('TextAddressLine1service').value +" , " + document.getElementById('TextAddressLine2service').value +" , "+ document.getElementById('TextCityservice').value +" , "+ document.getElementById('TextStateservice').value +" , "+  document.getElementById('TextZipCodeservice').value ;
                                   
        }
        function getProducts() {
    		var v = "6";
    		var url = "GetProducts?val=" + v;
    		if (window.XMLHttpRequest) {
    			request = new XMLHttpRequest();
    		} else if (window.ActiveXObject) {
    			request = new ActiveXObject("Microsoft.XMLHTTP");
    		}
    		try {
    			request.onreadystatechange = getInfo;
    			//req.onreadystatechange=getInfo;
    			request.open("GET", url, true);
    			request.send();
    		} catch (e) {
    			alert("Unable to connect to server");
    		}
    	}

    	function getInfo() {
    		{
    			if (request.readyState == 4) {
    				if (request.status == 200) {

    					document.getElementById("product1").innerHTML = request.responseText;
    					//window.alert("I m in 2nd function");
    				}

    			}
    		}
    	}

    </script>

</head>
<body onload="getProducts()">

<form id="SubscriptionWizard" action="" method="post">

    <table border="1" cellpadding="5" cellspacing="0" id="HeaderTable" class="vztable">

        <tr>

            
            <td id="HeaderTableStep1" style="background-color:Silver">

                Step 1:&nbsp; Select Product(s)</td>

            <td id="HeaderTableStep2" style="background-color:Silver">

                Step 2: Billing Address, Shipping Address, Service Address, Payment Method</td>
            
            <td id="HeaderTableStep3" style="background-color:Silver">

                Step 3: Choose Due Date</td>

            <td id="HeaderTableStep4" style="background-color:Silver">

                Step 4: Confirm order</td>

        </tr>

    </table>

    <br />
    <br>


<span id="Step1">
 <div align="center">
          <label class="vzh3">  Choose the product</label>
          <div class="inputwrap" id="product1">
<!--            <select id="product" multiple> -->
<!--   				<option value="1">Preferred HD</option> -->
<!--  				<option value="2">Extreme HD</option> -->
<!--   				<option value="3">Ultimate HD</option>	 -->
<!-- 			</select>  -->
</div>
			</div>
</span>
<span id="Step2" style="display:none">
<div align="center">
<div class="inputwrap">
		<label class="vzh3">FirstName:</label>
		<input id="firstName" name="firstName" type="text" class="vztext" /><br><br>
		</div >
		<div class="inputwrap">
		<label class="vzh3">LastName:</label>
		<input id="lastName" name="lastName" type="text" class="vztext" /><br><br>
		</div>
		<div class="inputwrap">
		<label class="vzh3">Phone:</label>
		<input id="phone" name="phone" type="text" class="vztext" /><br><br>
		</div>
		<div class="inputwrap">
		<label class="vzh3">Email Id:</label>
        <input id="TextEmail" name="Email" type="text" class="vztext" /><br><br>
        </div>
        <div>
         <h2 class="vzh2">Billing Address</h2><br>
         </div>
         <div class="inputwrap">
		<label class="vzh3">Address Line1</label>
            <input id="TextAddressLine1B" name="BAddressLine1" type="text" class="vztext" /><br><br>
            </div>
            <div class="inputwrap">
        <label class="vzh3">Address Line 2</label>
          <input id="TextAddressLine2B" name="BAddressLine2" type="text" class="vztext" /><br><br>
        </div>
        <div class="inputwrap">
        <label class="vzh3">City</label>
           <input id="TextCityB" name="BCity" type="text" class="vztext"/><br><br>
           </div>
           <div class="inputwrap">
       <label class="vzh3">State</label>
           <input id="TextStateB" name="BState" type="text" class="vztext" /><br><br>
      </div>
        <div class="inputwrap">
       <label class="vzh3">ZipCode</label>
            <input id="TextZipCodeB" name="BZipCode" type="text" class="vztext" /><br><br>
  	    </div>
  	      <div>
    <h2 class="vzh2">Service Address</h2><br>
      </div>
        <div class="inputwrap">
    <label class="vzh3">Address Line1</label>
        <input id="TextAddressLine1service" name="SAddressLine1" type="text" class="vztext" /><br><br>
      </div>
        <div class="inputwrap">
       <label class="vzh3">Address Line 2</label>
           <input id="TextAddressLine2service" name="SAddressLine2" type="text" class="vztext" /><br><br>
        </div>
          <div class="inputwrap">
          
       <label class="vzh3">City</label>
           <input id="TextCityservice" name="SCity" type="text" class="vztext"/><br><br>
         </div>
           <div class="inputwrap">
      <label class="vzh3">State</label>
           <input id="TextStateservice" name="SState" type="text" class="vztext" /><br><br>
          </div>
            <div class="inputwrap"> 
        <label class="vzh3">ZipCode</label>
            <input id="TextZipCodeservice" name="SZipCode" type="text" class="vztext" /><br><br>    
  </div>
    <div>
<label class="vzh3">Payment Method :</label>
<input type="radio" id="autopay" name="paymentmethod" value="Auto">
<label for="autopay" class="vzh3">AutoPay</label>&nbsp&nbsp
<input type="radio" id="cheque" name="paymentmethod" value="Cheque">
<label for="cheque" class="vzh3">Cheque</label>
  </div>
</div>
</span>
<span id="Step3" style="display:none">

</span>
    <span id="Step4" style="display:none">
	<div align="center">  
		<h2 class="vzh2">Confirm Order</h2>
		<table class="vztable1">
  		<tr><td align="left"><label class="vzh3">First name:</label></td><td id="viewfirstname"></td></tr>
       <tr><td align="left"><label class="vzh3">Selected Product:</label></td><td id="viewproduct"></td></tr>
		<tr><td align="left"><label class="vzh3">Billing Address :</label></td><td id="viewbillingaddress"></td></tr>
		 <tr><td align="left"><label class="vzh3">Service Address :</label></td><td id="viewserviceaddress"></td></tr>
         </table>
   </div>
    </span>
    <br><br>
<div align="center">
       
            <input id="ButtonPrevious" type="button" value="Previous" class="vzbtn" disabled="disabled" name="" onclick="handleWizardPrevious()" />

            <input id="ButtonNext" type="button" value="Next" class="vzbtn" name="Step2" onclick="handleWizardNext()" />

            <input id="SubmitFinal" type="submit" value="Finish" class="vzbtn" disabled="disabled" />
</div>
  

</form>

</body>

</html>