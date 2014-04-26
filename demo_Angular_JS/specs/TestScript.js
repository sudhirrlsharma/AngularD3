/**
 * Created by Lenovo on 1/2/14.
 */
'use strict';

function persion(name,age){
    this.name=name;
    this.age=age;
    this.remainingAge= function(){
        return 100-this.age;
    };
}
