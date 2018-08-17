let picDisModule = angular.module('picDisModule',[])

let types = [{'m_one':'精选收藏夹','m_two':'明星设计师'},
	{'m_one':'精选收藏夹','m_two':'世界杯'},
	{'m_one':'精选收藏夹','m_two':'毕业季'},
	{'m_one':'商用海报','m_two':'旅游海报'},
	{'m_one':'商用海报','m_two':'美食海报'},
	{'m_one':'商用海报','m_two':'招聘海报'},
	{'m_one':'手机用图','m_two':'表情包配图'},
	{'m_one':'手机用图','m_two':'企业宣传'},
	{'m_one':'插画绘图','m_two':'夏天插画'},
	{'m_one':'插画绘图','m_two':'星空插画'},
	]

picDisModule.directive('setpicdataset',function ($http) {
    return{
        restrict:'AE',
        replace:true,
        scope:{
        },
        templateUrl:'pictures.html',
        link:function(scope,elem,attrs){
        	scope.show = true
        	$http.get(attrs['setpicdataset']).success((data)=> {
        		let arr = []
				console.log(data)
				let len = data.length
				if(attrs['index'] == 'true' && data.length > 4)
					len = 4
				for(let i = 0;i < len;i++){
					let tmp = data[i].substr(50,2)
					let mId = Number(tmp)
					let obj = {'mId':mId,'m_one':types[mId-1].m_one,'m_two':types[mId-1].m_two,'pUrl':data[i]}
					arr.push(obj)
					
				}
				scope.picInfos = arr
        	})
        },
    }
})
picDisModule.controller('picDisController',($scope) => {
    $scope.showPicCover = () => $scope.isHidden = false
    $scope.hiddenPicCover =() => $scope.isHidden = true
})