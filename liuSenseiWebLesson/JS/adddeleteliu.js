$(document).ready(function(){
    for (var j = 0; j < 12; j++) {
        for (var i = 0; i < 30; i++) {
            $("#myCalender").append("<option>"+(j+1)+"Y"+(i+1)+"D</option>");
        }
    }

    var staffs=[
        {
            date:"1Y1D",
            shift:[
                {
                    name:"andy",
                    time:"1.00-3.00"
                },{
                    name:"bill555",
                    time:"1.00-4.00"
                }
            ]
        },{
            date:"1Y2D",
            shift:[
                {
                    name:"andy",
                    time:"9.00-10.00"
                },{
                    name:"cindy",
                    time:"2.00-7.00"
                }
            ]
        }
    ];

    function showShift(curDatePar){
        $("#main").empty();
        var curDate=curDatePar;
        var curDay;
        for (var day of staffs) {
            if(day.date==curDate){
                curDay=day;
                break;
            }
        }
        for (var staff of curDay.shift) {
            $("#main").append('<div class="staff"><span class="staffName">'+staff.name+'</span><span class="staffTime">'+staff.time+'</span></div> <input type="button" id="del" value=" ↖刪死他  "/>')
        }

    };
    $("#but").click(function(){
        // $("#main").append($("#inputName").val());
        var curDate=$("#myCalender").val();
        var curDay;
        for (var day of staffs) {
            if (day.date == curDate) {
                curDay = day;
                break;
            }
        }
        var staff={
            name:$("#inputName").val(),
            time:$("#inputTime").val()
        };
        curDay.shift.push(staff);
        showShift($("#myCalender").val());
    })




    showShift($("#myCalender").val());
    $("#myCalender").change(function (){
        showShift($(this).val());
    });


    $("#del").click(function(){

        var curDate=$("#myCalender").val();
        var curDay;
        for (var day of staffs) {
            if (day.date == curDate) {
                curDay = day;
                break;
            }
        }
        for (var staff of curDay.shift) {
            curDay.shift.remove(staff);
        }

        showShift($("#myCalender").val());
    })

});