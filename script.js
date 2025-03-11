// Array of image URLs
const images = [
    "wp2930102.jpg",
    "wp2671941.jpg",
    "th.jpg",
    "20008.jpg "
   ];
  
  // Get DOM elements
  const sliderImage = document.getElementById("sliderImage");
  const prevBtn = document.getElementById("prevBtn");
  const nextBtn = document.getElementById("nextBtn");
  
  let currentIndex = 0;
  
  // Function to display the current image
  function showImage(index) {
    sliderImage.src = images[index];
  }
  
  // Event listener for the "Next" button
  nextBtn.addEventListener("click", () => {
    currentIndex = (currentIndex + 1) % images.length; // Loop back to the first image
    showImage(currentIndex);
  });
  
  // Event listener for the "Previous" button
  prevBtn.addEventListener("click", () => {
    currentIndex = (currentIndex - 1 + images.length) % images.length; // Loop back to the last image
    showImage(currentIndex);
  });
  
  // Display the first image initially
  showImage(currentIndex);