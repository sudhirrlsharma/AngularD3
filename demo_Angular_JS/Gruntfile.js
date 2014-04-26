module.exports = function(grunt) {
  grunt.initConfig({
    jasmine : {
	test:{
      // Your project's source files
      src : 'js/controller/beerCtrl.js',
      // Your Jasmine spec files
	   options: {
			specs : [
				'specs/**/spec*.js'
			],
			vendor: [
			         'https://ajax.googleapis.com/ajax/libs/angularjs/1.2.9/angular.js',
			         'https://ajax.googleapis.com/ajax/libs/angularjs/1.2.9//angular-mocks.js',
			         'http://code.angularjs.org/1.2.0/angular-resource.js',
			         'http://code.angularjs.org/1.2.0/angular-route.js',
			         'http://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js',
			         'js/app.js'
          ]
		}
    }
	}
  });

  // Register tasks.
  grunt.loadNpmTasks('grunt-contrib-jasmine');
  // Default task.
  grunt.registerTask('default', 'jasmine');
};