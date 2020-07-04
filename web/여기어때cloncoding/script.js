$(document).ready(
		function() {
			$("#ebt1").click(
					function() {
						$("#event1").css("opacity", "0").stop().css(
								"background-image", "url('adv1.jpg')").animate(
								{
									opacity : 1
								}, 500)
					}), $("#ebt2").click(
					function() {
						$("#event1").css("opacity", "0").stop().css(
								"background-image", "url('adv2.jpg')").animate(
								{
									opacity : 1
								}, 500)
					}), $("#ebt3").click(
					function() {
						$("#event1").css("opacity", "0").stop().css(
								"background-image", "url('adv3.jpg')").animate(
								{
									opacity : 1
								}, 500)
					}), $("#ebt4").click(
					function() {
						$("#event1").css("opacity", "0").stop().css(
								"background-image", "url('adv4.jpg')").animate(
								{
									opacity : 1
								}, 500)
					})

		})
$(document).ready(
		function() {
			$(".menu").hover(function() {
				$(this).css("color", "gray").css("opacity", "0.5")
			}), $(".menu").mouseout(function() {
				$(this).css("color", "white").css("opacity", "1")
			}), $("#more").click(function() {
				$("#morediv").fadeToggle("slow");
			}), $("#motel").hover(
					function() {
						$("#kante").css("opacity", "0").stop().attr("src",
								"motelimg.png").animate({
							opacity : 1
						}, 500)
					}), $("#hotel").hover(
					function() {
						$("#kante").css("opacity", "0").stop().attr("src",
								"hotelimg.png").animate({
							opacity : 1
						}, 500)
					}), $("#pension").hover(
					function() {
						$("#kante").css("opacity", "0").stop().attr("src",
								"pensionimg.png").animate({
							opacity : 1
						}, 500)
					}), $("#resort").hover(
					function() {
						$("#kante").css("opacity", "0").stop().attr("src",
								"resortimg.png").animate({
							opacity : 1
						}, 500)
					}), $("#house").hover(
					function() {
						$("#kante").css("opacity", "0").stop().attr("src",
								"houseimg.png").animate({
							opacity : 1
						}, 500)
					}), $("#camping").hover(
					function() {
						$("#kante").css("opacity", "0").stop().attr("src",
								"campingimg.png").animate({
							opacity : 1
						}, 500)
					}), $("#location").hover(
					function() {
						$("#kante").css("opacity", "0").stop().attr("src",
								"locationimg.png").animate({
							opacity : 1
						}, 500)
					}), $(".mimg").mouseout(function() {
				$("#kante").attr("src", "kante.png")
			})

		})
$(document).ready(function() {
	$("#checkin").change(function() {
		$("#checkout").attr("min", $("#checkin").val())
	}), $("#checkout").change(function() {
		$("#checkin").attr("max", $("#checkout").val())
	})
})
