module.exports = function(grunt) {
	grunt
			.initConfig({
				jasmine : {
					test : {
						// Your project's source files
						src : 'js/controller/beerCtrl.js',
						// Your Jasmine spec files
						options : {
							specs : [ 'specs/**/spec*.js' ],
							vendor : [
									'https://ajax.googleapis.com/ajax/libs/angularjs/1.2.9/angular.js',
									'https://ajax.googleapis.com/ajax/libs/angularjs/1.2.9//angular-mocks.js',
									'http://code.angularjs.org/1.2.0/angular-resource.js',
									'http://code.angularjs.org/1.2.0/angular-route.js',
									'http://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js',
									'js/app.js' ]
						}
					}
				},
				'http-server': {

							'dev': {
							
							    // the server root directory
							    root: ".",
							
							    port: 8282,
							    // port: function() { return 8282; }
							
							    host: "127.0.0.1",
							
							    cache: 10,
							    showDir : true,
							    autoIndex: true,
							    defaultExt: "html",
							
							    // run in parallel with other tasks
							    runInBackground: false
							
							}
				}
			});

	// Register tasks.
	grunt.loadNpmTasks('grunt-contrib-jasmine');
	grunt.loadNpmTasks('grunt-http-server');
	
	// Default task.
	grunt.registerTask('default', 'jasmine');
};