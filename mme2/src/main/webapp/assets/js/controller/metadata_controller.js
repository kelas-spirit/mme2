/**
 * 
 */
App.controller('DocumentController', ['$scope', 'metadata','$http', function($scope, metadata,$http){
	
	metadata.getMetadataList.success(function(data) { 
	    $scope.metadataList = data; 
	  });
	
	metadata.getCategoryList.success(function(data) { 
	    $scope.categoryList = data; 
	  });
	
	
	$scope.removeCategory = function(id){
		//alert("privet "+ id);
		var data = {'id':id};
		$http.post("http://localhost:8080/mme2/deletecategory/"+id).success(function(data, status) {
        });
		
		$scope.categoryList.splice($scope.metadataList.indexOf(id),1);
	}
	
	$scope.remove = function(id){
		//alert("privet "+ id);
		var data = {'id':id};
		$http.post("http://localhost:8080/mme2/deletemetadata/"+id).success(function(data, status) {
        });
		
		$scope.metadataList.splice($scope.metadataList.indexOf(id),1);
	}
	
}]);