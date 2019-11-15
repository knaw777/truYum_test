function validateMenuItemForm(){
     var title = document.forms["editMenuForm"]["mname"].value;
     var price = document.forms["editMenuForm"]["price"].value;
     var launchDate = document.forms["editMenuForm"]["launchdate"].value;
     var category = document.forms["editMenuForm"]["category"].value;
     //alert("category.."+category);
    
    

     if(title == "") {
            alert("Title is required");
            return false;
      }
     else if(title.length < 2 || title.length > 65){
           alert("Title should have 2 to 65 characters");
           return false;
     }
     else if(price == ""){
         alert("Price is required");
         return false;
     }
     else if(isNaN(price)){
         alert("Price has to be number");
         return false;
     }
     else if(launchDate == "") {

       alert("Date of launch is required");
         return false;

      }
     else if(category == "Default") {

       alert("Select one category");
         return false;

      }

  }