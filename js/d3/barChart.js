/**
 * Created by Lenovo on 16/2/14.
 */
d3.json("data/beer.json"), function (data) {

    var canvas = d3.select("#chart")
        .append("svg:svg")
        .attr("width", 300)//canvasWidth)
        .attr("height", 300);//canvasHeight)

    canvas.selectAll("rect")
        .data(data)
            .enter()
            .append("rect")
                .attr("width",function(d){return d.price*10;})
                .attr("hight",200)
                .attr("y", function(d,i){return d.price*50;})
                .attr("fill","blue");


}

