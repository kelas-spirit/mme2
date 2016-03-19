/**
 * controller
 */

'use strict';

App.controller('DocumentController', ['$scope', 'CategoryDao', function($scope, CategoryDao){
	var self = this;
	self.category=[];

	self.categoryList= function(){
		CategoryDao.categoryList()
		.then(
				function(d) {
                    self.category = d;
               },
                function(errResponse){
                    console.error('Error while fetching Currencies');
                }
		
		);
	}
	self.categoryList();
	
	
}]);