let picDisModule = angular.module('picDisModule',[])
picDisModule.directive('setpicdataset',function ($http) {
    return{
        restrict:'AE',
        replace:true,
        templateUrl:'pictures.html',
        link:function(scope,elem,attrs){
//            $http.get(attrs['setpicdataset']).success((data)=> scope.picInfos = data )
        },
    }
})
picDisModule.controller('picDisController',($scope) => {
    $scope.showPicCover = () => $scope.isHidden = false
    $scope.hiddenPicCover =() => $scope.isHidden = true
})