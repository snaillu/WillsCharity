var Base = {
		ajax: function(params,callback){
			var self = this;
			$.ajax({
				type:"POST",
				url:params.url,
				data:params,
				dataType:"json",
				success:function(data){
					callback.call(self,data);
				},
				error:function(data){
					callback.call(self,data);
				}
			});
		}
};

/*
 *	by snail@ 2015/02/09 16:14
 *	common javascript tools
 * 
 */

var Utils = {
		//check param is emptys
		isEmpty:function(param){
			return typeof param == "undefined" || param === null || param === "";
		},
		
		//check email is validate
		checkEmail:function(email){
			var reg = /^[\w-]+(\.[\w-]+)*@[\w-]+(\.[\w-]+)+$/;
			return reg.test(email);
		},
		
		//check phone number is validate
		checkMobile:function(phoneNum){
			var reg = /^[1][3][0-9]{9}$/;
			return reg.test(phoneNum);
		}
};

/*
 *	by snail@ 2015/02/09 16:14
 *	date format
 * 
 */
Date.prototype.format = function (fmt) {
    var o = {
        "M+": this.getMonth() + 1, //月份 
        "d+": this.getDate(), //日 
        "h+": this.getHours(), //小时 
        "m+": this.getMinutes(), //分 
        "s+": this.getSeconds(), //秒 
        "q+": Math.floor((this.getMonth() + 3) / 3), //季度 
        "S": this.getMilliseconds() //毫秒 
    };
    if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var k in o)
        if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
    return fmt;
};