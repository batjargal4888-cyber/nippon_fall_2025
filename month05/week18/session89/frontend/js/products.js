const PHOTOS_API = 'https://jsonplaceholder.typicode.com/photos';

const fetchResult = fetch(PHOTOS_API); // FETCH API

console.log('promise 1', fetchResult); // promise 1

const dataResult = fetchResult
    .then((data) => {
        return data.json();
    });

console.log('promise 2', dataResult); // promise 2

dataResult.then((result) => {
    console.log(result);
});

// promise(promise(data)); => resolve promise(data); => resolve data;

fetch(PHOTOS_API)
    .then((response) => response.json())
    .then((data) => {
        const myDataArray = data; // []
        for (let i = 0; i < myDataArray.length; i++) {
            const title = document.createElement('h1');
            title.textContent = myDataArray[i].title;
            const photoImage = document.createElement('img');
            photoImage.src = myDataArray[i].url;
            document.body.appendChild(title);
            document.body.appendChild(photoImage);
        }
    });