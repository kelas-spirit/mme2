
App.controller('CategoryController', ['$scope', 'metadata','$http', function($scope, metadata,$http){
	
	metadata.getCategoryList.success(function(data) { 
	    $scope.categoryList = data; 
	  });
	
	$scope.remove = function(id){
		//alert("privet "+ id);
		var data = {'id':id};
		$http.post("http://localhost:8080/mme2/deletemetadata/"+id).success(function(data, status) {
        });
		
	//	$scope.metadataList.splice($scope.metadataList.indexOf(id),1);
	}
	
}]);