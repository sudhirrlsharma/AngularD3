angular.module('myApp', ['smartTable.table'])
    .controller('mainCtrl', ['$scope',
        function(scope) {
            scope.greetings = "world";

            var nameAsset = ['Pierre', 'Pol', 'Jacques', 'Laurent', 'Nicolas'];
            var generateRandomItem = function(id) {
                var
                    age = Math.floor(Math.random() * 100),
                    balance = Math.random() * 10000,
                    name = nameAsset[Math.floor(Math.random() * 5)],
                    email = name + balance + '@' + name + '.com';

                return {
                    id: id,
                    name: name,
                    email: email,
                    age: age,
                    balance: balance
                };
            };

            scope.rowCollection = [];

            for (var i = 0; i < 400; i++) {
                scope.rowCollection.push(generateRandomItem(i));
            }


            scope.columnCollection = [{
                label: 'id',
                map: 'id'
            }, {
                label: 'Name',
                map: 'name'
            }, {
                label: 'Age',
                map: 'age'
            }, {
                label: 'Balance',
                map: 'balance',
                isEditable: true,
                type: 'number',
                formatFunction: 'currency',
                formatParameter: '$'
            }, {
                label: 'Email',
                map: 'email',
                type: 'email',
                isEditable: true
            }];

            scope.globalConfig = {
                isPaginationEnabled: true,
                itemsByPage: 20
            };
        }
    ]);