/**
 * Created by janet.bogle on 7/17/17.
 */
// create drop down with choices
const showDropDown = (divStr, elementStr, category) => {
    console.log("in showDropDown")
    showArea(divStr);
    let element = document.getElementsByClassName(elementStr);
    alert("element is: " + element[0]);
    // get choices from db. Mocked for now.
    let jobChoices = getJobFieldChoices(category);
    // load the drop-down on the form with choices
    loadChoices(element[0], jobChoices);
}

// make the areas visible when we come to them
const showArea = (divStr) => {
    "use strict";
    let element = document.getElementsByClassName(divStr);
    alert("element for class: " + divStr + " is: " + element);
    // we set default to hidden. See if default is still on
    if (divStr === "main" && getComputedStyle(element[0]).visibility === "hidden") {
        // Show first drop down on startup
        element[0].style.visibility = "visible";
    }
    else if (divStr === "sub" && getComputedStyle(element[0]).visibility === "hidden") {
        // Show sub-Field drop down after 1st category is chosen
        element[0].style.visibility = "visible";
    }
}

// add the option attributes to the select element
const loadChoices = (element, choices) => {
    // first clear the drop down list
    element.options.length = 0;   // why does it think this is a constant??
    element.size = choices.length;      // set drop down size to show all elements
    // for each choice, add an option attribute to the select tag
    choices.forEach(function(option) {
        element.options.add(new Option(option, option));
    });
}

// get applicable choices
function getJobFieldChoices(category) {
    // query db for choices, mock for now
    switch (category) {
        case 'mainChoices':  // top-level drop down
            return ["energy", "food", "pharmaceuticals", "miscellaneous"];
            break;

        case 'energy':       // get choices for energy category
            return ["traditional", "renewable"];
            break;

        case 'food':       // get choices for food category
            return ["no further choices"];
            break;

        case 'pharmaceuticals':       // get choices for pharma category
            return ["no further choices"];
            break;

        case 'miscellaneous':        // get choices for misc category
            return ["paint", "plastics", "fertilizer", "construction materials"];
            break;

        default:
            break;
    }
}

// probably a better way to do this
const showSubmit = () => {
    let element = document.getElementsByClassName("button");
    if (getComputedStyle(element[0]).visibility === "hidden") {
        element[0].style.visibility = "visible";
    }
}



const getJobsMain = () => {
    "use strict";
    alert("in getJobsMain");
    // need to map url to java method
    let url = "??"; // java method: chemeservice.getJobsMain
    fetch(url).then(function(response) {
        response.text().then(function(text) {
            alert(text);
        });
    });
}

// initialize with first drop-down
(function appInit() {
    console.log("Inside the app init");
    //showDropDown("main", "jobField", "mainChoices");
})();