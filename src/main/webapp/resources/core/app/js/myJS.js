
var a = new changeEmployList();





function changeEmployList (){
    var scope;
function register(registerScope){
    this.scope = registerScope;
}

    function update($http){
        setTimeout(function () {
            this.scope.$apply(function () {
                $http.get('employList').success(function (data) {
                    console.log("go to server");
                    scope.employs = data;
                });

            });
        }, 5000);
    }


}