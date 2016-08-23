/**
 * Created by dyr on 2016/8/23.
 */
window.onload = function () {
    var right=document.getElementById("right");
    var n=1;
    document.onscroll=function () {
        var screenHeight = document.documentElement.clientHeight;
        var scrollHeight=document.documentElement.scrollTop||document.body.scrollTop;
        var rightHeight=right.scrollHeight;
        console.log(screenHeight+" : "+scrollHeight+" : "+rightHeight+" : ["+(screenHeight+scrollHeight-rightHeight)+"] : "+n++);
        if(screenHeight+scrollHeight>rightHeight){
            right.classList.add("fixed");
            console.log("add class !");
        }else{
            right.classList.remove("fixed");
            console.log("remove class !");
        }
    }
};
