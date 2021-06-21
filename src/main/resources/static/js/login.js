let index = {
    init: function(){
        $("#btn-login").on("click", ()=>{ //function(){}, ()=>{} this를 바인딩하기 위해서!!
            this.login();
        });
    },

    login: function() {
        //alert('user의 save함수 호출됨')
        let data = {
            username: $("#username").val(),
            password: $("#password").val(),
        };

        $.ajax({
            type:"POST",
            url:"/api/user/login",
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType: "json"
        }).done(function(resp){
            alert("로그인이 완료되었습니다.");
            location.href = "/";
        }).fail(function(error){
            alert(JSON.stringify(error));
        });
    }

}

index.init();