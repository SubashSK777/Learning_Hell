int n = arr.length;
int even = 0;
for(int i = 0; i < n; i++){
	if(arr[i] % 2 == 0) even++;
}
int odd = n - odd;

int totTrip = (n * (n - 1) * (n - 2)) // 6;

int oddTrip = 0;

if(odd > 3){
	oddTrip = (odd * (odd - 1) * (odd - 2)) // 6;
}

evenTrip = (totTrip - oddTrip) % 1000000007;

return evenTrip;
