/**
 * Created by dyr on 2016/7/31.
 */
module.exports={
    assertEquals:function (a,b) {
        console.log(a+":"+b+":"+(a===b));
        return a===b;
    }
}