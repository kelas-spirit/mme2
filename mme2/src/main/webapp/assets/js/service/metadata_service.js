/**
 * 
 */

App.factory('metadata', ['$http', function($http){
	
	return{ 
		
	getMetadataList: $http.get('http://localhost:8080/mme2/indexadmin') .success(function(data) { 
      return data; 
    }) .error(function(err) { 
      return err; 
    }),
    
    getCategoryList:
    	$http.get('http://localhost:8080/mme2/category') .success(function(data) { 
    	      return data; 
    	    }) .error(function(err) { 
    	      return err; 
    	    })
    
	
	}
	
	
}]);
/*App.factory('category', ['$http', function($http){
	
	return $http.get('http://localhost:8080/mme2/category') .success(function(data) { 
      return data; 
    }) .error(function(err) { 
      return err; 
    });
	
	
}]);*/