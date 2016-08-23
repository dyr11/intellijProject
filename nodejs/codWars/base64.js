/**
 * Created by dyr on 2016/7/31.
 */
var Test = require('./myUtil');
//Test.assertEquals(1, 2);

String.prototype.toBase64 = function () {
    var buffer = new Buffer(this.toString());
    return buffer.toString('base64');


};
String.prototype.fromBase64 = function () {
    var buffer = new Buffer(this.toString(), 'base64');
    return buffer.toString();
};


String.prototype.toBase64 = function() {
    var t = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    var str=this.toString();
    var s=str.length%3===0?0:3-str.length%3;
    str+="000".substring(0,s);
    var result=str.split('').map(function (val) {
            return ("00000000"+val.charCodeAt(0).toString(2)).slice(-8);
    }).join('').match(/.{6}/g).map(function (x) {
        return t[parseInt(x,2)];
    }).join('');
   // return result;
    if(s===0)
        return result;
    return result.slice(0,-s)+"===".substring(0,s);
};

String.prototype.fromBase64 = function() {
    var t = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=";
    return this.split('').map(function(val) {
        return ("000000"+t.indexOf(val).toString(2)).slice(-6);
    }).join('').match(/.{1,8}/g).map(function(val) {
        return String.fromCharCode(parseInt(val, 2));
    }).join('');
}

console.log("eee".slice(0,-0))
//console.log(Math.ceil(3.4))
//console.log(new Buffer("Hello World").toString('base64'));
Test.assertEquals('this is a string!'.toBase64(), 'dGhpcyBpcyBhIHN0cmluZyE=');
Test.assertEquals('dGhpcyBpcyBhIHN0cmluZyEh'.fromBase64(), 'this is a string!!');

