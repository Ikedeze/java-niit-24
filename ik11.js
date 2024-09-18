function validate() {
    var user = document.getElementById('freak').value;
    if(isNaN(freak)){
        alert('Enter numbers only')
    }else{
        alert('Enter numbers in your Pin')
    }
    if (myF.user.value =='') {
        myF.user.value
        myF.user.focus()
        alert('input user name first')
        myF.freak.disabled = true ;
    }
}
function verify(){
    myF.freak.disabled = false ;
}