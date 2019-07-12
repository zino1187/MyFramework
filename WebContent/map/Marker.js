class Marker{
	constructor(lati, longi, map, msg){
		this.lati=lati;
		this.longi=longi;
		this.map=map;
		this.msg=msg;
		
		this.marker = new google.maps.Marker({
			position:new google.maps.LatLng(lati, longi) ,
			animation:google.maps.Animation.BOUNCE,
			icon:{
				url:"/images/e1.png",
				scaledSize: new google.maps.Size(50,55)				
			}
		});

		this.infowin = new google.maps.InfoWindow({
			content:this.msg
		});
		
		google.maps.event.addListener(this.marker, "click",()=> {
			this.infowin.open(this.map, this.marker);
		});
		
		this.marker.setMap(this.map);
	}
	
}