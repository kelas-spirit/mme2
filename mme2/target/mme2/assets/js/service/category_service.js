/**
 * 
 */

'use strict';

App.factory('CategoryDao', ['$http', '$q', function($http, $q){
	
	return{
		
		categoryList: function(){
			return $http.get('http://localhost:8080/mme2/category')
            .then(
                    function(response){
                        return response.data;
                    }, 
                    function(errResponse){
                        console.error('Error while fetching category list');
                        return $q.reject(errResponse);
                    }
            );
		}
		
		
		
		
	}
	
	
}]);

